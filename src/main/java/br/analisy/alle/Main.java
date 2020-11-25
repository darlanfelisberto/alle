package br.analisy.alle;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import br.analisy.alle.models.PcGtsType;

public class Main {
	
	static public String pathResult = "C:\\aletheia GT\\saida.txt";

	public static void main(String[] args) {
		OutputStream saida = null;
		// TODO Auto-generated method stub
		try {
			Files.deleteIfExists(Paths.get(pathResult));
			saida = Files.newOutputStream(Paths.get(pathResult),StandardOpenOption.CREATE);
		} catch (IOException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
			System.exit(1);
		}
//		try {
//			main2.initProva(getListFilesByFolder(Paths.get("C:\\aletheia GT\\2019\\prova jpg e xml\\AGRONOMIA")));
//			System.exit(0);
//		} catch (IOException e2) {
//			// TODO Auto-generated catch block
//			e2.printStackTrace();
//		}
//		
		List<Path> anos = null;
		try {
			Stream<Path> pth = Files.list(Paths.get("C:\\aletheia GT"));
			anos = pth.sorted().collect(Collectors.toList());

			
			for (Path ano : anos) {
				List<Path> provas = Files.list(ano.resolve("prova jpg e xml")).sorted().collect(Collectors.toList());
				for (Path p: provas) {
					try {
						AnalisyXML ax = new AnalisyXML(saida);	
						ax.open(p);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			saida.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		System.out.println("fim");
		
		
	}
}