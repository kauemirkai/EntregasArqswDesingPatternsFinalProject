package Facade.Facade;
/**
 * 
 * @author Kaue victor Paz Garcia Mirkai.
 * Ra:81613004
 * Professor:Bonato
 * 			
 *
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOFacade {

	public void gravarArquivoBinario(String nome, byte[] conteudo) {
		File outFile = new File(nome);
		try {
			FileOutputStream outStream = new FileOutputStream(outFile);
			outStream.write(conteudo);
			outStream.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
	public void lerArquivoBinarui(String nome) {
		File inFile = new File(nome);
		try {
			FileInputStream inStream= new  FileInputStream(inFile);
			int tamanho = (int)  inFile.length();
			
			byte[] conteudo = new byte[tamanho];
			inStream.read(conteudo);
			for (int i = 0 ; i<conteudo.length; i++) {
				System.out.println(conteudo[i]);
				
				
				
			}
			
			inStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
