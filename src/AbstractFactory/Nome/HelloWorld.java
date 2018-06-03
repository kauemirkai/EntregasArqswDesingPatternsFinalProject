package AbstractFactory.Nome;

/**
 * 
 * @author Kaue victor Paz Garcia Mirkai.
 * Ra:81613004
 * Professor:Bonato
 * 			
 *
 */

public class HelloWorld {
	
	private AbstractFactory fabrica;

	public HelloWorld() {
		double rand = Math.random();

		if (rand <= 0.5)
			fabrica = new FabricaTela();
		else fabrica = new FabricaArquivo();
	}

	public void enviarHelloWorld() {
		Impressao impressao = fabrica.criarImpressao();
		System.out.println("Utilizando " + impressao.getClass().getSimpleName());
		impressao.imprimir("Hello, World!");
	}
	
}