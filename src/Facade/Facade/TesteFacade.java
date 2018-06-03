package Facade.Facade;
/**
 * 
 * @author Kaue victor Paz Garcia Mirkai.
 * Ra:81613004
 * Professor:Bonato
 * 			
 *
 */
public class TesteFacade {
	public static void main(String[] args) {
		IOFacade iof = new IOFacade();
		byte[] byteArray = {10,20,30,40,50};
		iof.gravarArquivoBinario("TesteBin", byteArray);
		iof.lerArquivoBinarui("TesteBin");
		
		

	}
}
