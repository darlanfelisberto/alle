package br.analisy.alle;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.DelayQueue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import br.analisy.alle.models.ImageRegionType;
import br.analisy.alle.models.PageType;
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
	
	Pattern pattern = Pattern.compile("((QUESTÃO|Questão|QUESTÃO DISCURSIVA|Questão Discursiva)( [0-9]{1,2}))|^[0-9]{1,2}\\.|^[0-9]{1,2}\n", Pattern.CASE_INSENSITIVE);
	//([\\w\\d\\s\\S]*)(QUESTÃO DISCURSIVA [0-9]{1,2}|QUESTÃO [0-9]{1,2})([\\w\\d\\s\\S]*)
		
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
			dPage.getText().append(te.getUnicode());
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
	
	public void print() {
		this.dg.print();
	}
}





