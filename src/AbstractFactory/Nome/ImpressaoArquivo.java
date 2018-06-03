package AbstractFactory.Nome;

/**
 * 
 * @author Kaue victor Paz Garcia Mirkai.
 * Ra:81613004
 * Professor:Bonato
 * 			
 *
 */
import java.io.File;
import java.io.PrintWriter;


public class ImpressaoArquivo implements Impressao {
	private File arquivo;


	public ImpressaoArquivo(String nomeArquivo) {
		this.arquivo = new File(nomeArquivo);
	}

	public void imprimir(String string) {

		try {
			arquivo.createNewFile();
			PrintWriter writer = new PrintWriter(arquivo);
			writer.print(string);
			writer.close();

			System.out.println("Verifique arquivo: " + arquivo.getPath());
		}

		catch (Exception e) {
			System.out.println("Não foi possivel criar o arquivo output.txt");
		}
	}

}
