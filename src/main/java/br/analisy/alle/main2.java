package br.analisy.alle;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import br.analisy.alle.models.PcGtsType;

public class main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			main2.initProva(getListFilesByFolder(Paths.get("C:\\aletheia GT\\2019\\prova jpg e xml\\AGRONOMIA")));
			System.exit(0);
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
//		
		List<Path> anos = null;
		try {
			Stream<Path> pth = Files.list(Paths.get("C:\\aletheia GT"));
			anos = pth.sorted().collect(Collectors.toList());

			
			for (Path ano : anos) {
				Stream<Path> cAno = Files.list(ano.resolve("prova jpg e xml"));
				cAno.sorted().collect(Collectors.toList()).forEach(p->{
					System.out.println(p);
					try {
						main2.initProva(main2.getListFilesByFolder(p));
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}	
				});
				
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		System.out.println("fim");
	}

	static private List<Path> getListFilesByFolder(Path path) throws IOException {
		Stream<Path> pth = Files.walk(path);
		return pth.filter(p -> p.getFileName().toString().endsWith(".xml"))
				.sorted()
				.collect(Collectors.toList());

	}

	static private void initProva(List<Path> files) {
		AnalisyXML ax = new AnalisyXML();
		try {
			for (Path p : files) {
			
				JAXBContext context = JAXBContext.newInstance(PcGtsType.class);
				Unmarshaller unMar = context.createUnmarshaller();
				PcGtsType pc = (PcGtsType) unMar.unmarshal(new File(p.toString()));

				try {
					ax.analisy(pc.getPage());	
				} catch (Exception e) {
					System.out.println(pc.getPage().getImageFilename());
					e.printStackTrace();
				}
				
				
			}
		} catch (JAXBException e) {
			e.printStackTrace();
		}

		ax.print();
		//System.out.println("fim");

	}

}


/*
 * 2004
 * farmacia removido xml 10
 * fisioterapia falta os "quetao"
 * 
 * 
 * 
 * C:\\aletheia GT\\2007\\prova jpg e xml\\formacaogeral2  colocar questoes
 * */
