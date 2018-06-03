package ChainOfResponsibility.SlotMachine;
/**
 * 
 * @author Kaue victor Paz Garcia Mirkai.
 * Ra:81613004
 * Professor:Bonato
 * 			
 *
 */
public class Troco implements Chain {
	private Chain nextInChain;

	@Override
	public void setNextChain(Chain nextChain) {
		this.nextInChain = nextChain;

	}

	@Override
	public void debita(ValorProd valorProd, ValorMoeda valorMoeda) {
		if (valorMoeda.getValorDaMoeda() == 0) {
			valorProd.setValorAtual(valorProd.getValorAtual() - 0);
			System.out.println("Valor do produto:" + valorProd.getValorAtual());

		} 
		if (valorProd.getValorAtual() <= 0) {
			System.out.println("");
			System.out.println("O produto: "+ valorProd.getNomeProd() + " Está entregue.");
			System.out.println("Seu troco é de: " + valorProd.getValorAtual() * -1);
		} else {
			System.out.println("Ainda falta: " + valorProd.getValorAtual() + " Para entregar: " + valorProd.getNomeProd());

		}

	}

}
