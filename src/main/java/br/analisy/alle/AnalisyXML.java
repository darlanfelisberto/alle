package br.analisy.alle;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.DelayQueue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import br.analisy.alle.models.ImageRegionType;
import br.analisy.alle.models.PageType;
import br.analisy.alle.models.PcGtsType;
import br.analisy.alle.models.RegionType;
import br.analisy.alle.models.SeparatorRegionType;
import br.analisy.alle.models.TableRegionType;
import br.analisy.alle.models.TextEquivType;
import br.analisy.alle.models.TextRegionType;

public class AnalisyXML {
	
	//private PageType page;
	private int middle;
	
	private DadosGerais dg = new DadosGerais();
	private DadosPagina dPage = new DadosPagina(null);
	private PageType page = null;
	private OutputStream out = null;
	
	Pattern pattern = Pattern.compile("((QUESTÃO|Questão|QUESTÃO DISCURSIVA|Questão Discursiva)( [0-9]{1,2}))|^[0-9]{1,2}\\.|^[0-9]{1,2}\n", Pattern.CASE_INSENSITIVE);
	//([\\w\\d\\s\\S]*)(QUESTÃO DISCURSIVA [0-9]{1,2}|QUESTÃO [0-9]{1,2})([\\w\\d\\s\\S]*)
		
	static private List<Path> getListFilesByFolder(Path path) throws IOException {
		Stream<Path> pth = Files.walk(path);
		return pth.filter(p -> p.getFileName().toString().endsWith(".xml"))
				.sorted()
				.collect(Collectors.toList());
	}	
	
	public AnalisyXML(OutputStream saida) {
		this.out = saida;
	}


	public void open(Path folder) throws IOException {
		try {
			for (Path p : getListFilesByFolder(folder)) {
			
				JAXBContext context = JAXBContext.newInstance(PcGtsType.class);
				Unmarshaller unMar = context.createUnmarshaller();
				PcGtsType pc = (PcGtsType) unMar.unmarshal(new File(p.toString()));

				try {
					this.analisy(pc.getPage());
					
					this.printStringToFile(folder.toString());
					this.printStringToFile(this.dg.printToString());
				} catch (Exception e) {
					System.out.println(pc.getPage().getImageFilename());
					e.printStackTrace();
				}		
			}
			this.saveQuestoes(folder);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	
	
	public void analisy(PageType page) throws Exception {
		this.page = page;
		this.middle = page.getImageWidth()/2;
		
//		System.out.println(page.getImageFilename());
		
		for(RegionType regionType:page.getTextRegionOrImageRegionOrLineDrawingRegion()) {
			
			if(regionType instanceof SeparatorRegionType) {
				regionType.getCoords();
				if(((SeparatorRegionType) regionType).vertical()) {
					this.middle = regionType.getCoords().getMiddle();
				}
				
			}			
			if(regionType instanceof TextRegionType) {
				this.alnalizyTextRegion((TextRegionType)regionType);
			}else
			if(regionType instanceof ImageRegionType) {
				dPage.addImg();
			}else
			if(regionType instanceof TableRegionType) {
				dPage.addTab();
			}
		}
		
		this.dg.sinc(dPage);
//		this.dg.print();
		
		if(this.dPage.temProblen()) {
			this.dPage = new DadosPagina(this.dPage);
		}
	}
	
	private void alnalizyTextRegion(TextRegionType text) {
		
		for (TextEquivType te : text.getTextEquiv()) {
			dPage.getText().append(te.getUnicode()+"\n\n");
			if(this.pattern.matcher(te.getUnicode()).find()) {				
				dPage.addQuestao();
				LayoutPdf lay = (text.getCoords().is2Col(this.middle) ? LayoutPdf.COLUNA_2:LayoutPdf.COLUNA_1);
				
				this.dPage.setLayout((this.dPage.getLayout() != null && !lay.equals(this.dPage.getLayout()) ?LayoutPdf.MISTO:lay));
				
			}else {
				dPage.addTextoSolto(this.page.getImageFilename()+", ");
				//remove elements add previous in vector, only firt pass
//				this.remove();
//				
//				//layout = LayoutPdf.MISTO;
//				this.vqp = true;
			}
		}
	}
		
	public void printStringToFile(String s) throws IOException {
		System.out.println(s);
		this.out.write(s.getBytes());		
	}
	
	
	public void saveQuestoes(Path folder) throws IOException {
			Path txt = folder.resolve("texto_da_prova.txt");
			Files.deleteIfExists(txt);
			Files.write(txt, this.dg.getText().toString().getBytes(),StandardOpenOption.CREATE_NEW);
	}
}





