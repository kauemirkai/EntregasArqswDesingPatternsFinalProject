package ChainOfResponsibility.SlotMachine;
/**
 * 
 * @author Kaue victor Paz Garcia Mirkai.
 * Ra:81613004
 * Professor:Bonato
 * 			
 *
 */
public class Test {
	public static void main(String[] args) {
		Chain chain1cent = new Slot1Cent();
		Chain chain5cent = new Slot5Cent();
		Chain chain10cent = new Slot10Cent();
		Chain chain25cent = new Slot25Cent();
		Chain chain50cent = new Slot50Cent();
		Chain chain100cent = new Slot100Cent();
		Chain Troco = new Troco();
		
		
		
		chain1cent.setNextChain(chain5cent);
		chain5cent.setNextChain(chain10cent);
		chain10cent.setNextChain(chain25cent);
		chain25cent.setNextChain(chain50cent);
		chain50cent.setNextChain(chain100cent);
		chain100cent.setNextChain(Troco);
		
		ValorProd prod = new ValorProd();
		prod.setValorProd(1.10);
		prod.setValorAtual(1.10);
		prod.setNomeProd("Batatinhas");
		

		
		ValorMoeda moeda1 = new ValorMoeda();
		moeda1.setValorDaMoeda(0.05);
		ValorMoeda moeda2 = new ValorMoeda();
		moeda2.setValorDaMoeda(0.10);
		ValorMoeda moeda3 = new ValorMoeda();
		moeda3.setValorDaMoeda(0.50);
		ValorMoeda moeda4 = new ValorMoeda();
		moeda4.setValorDaMoeda(0.01);
		
		ValorMoeda moeda5 = new ValorMoeda();
		moeda5.setValorDaMoeda(1.0);
		
		ValorMoeda troco = new ValorMoeda();
		troco.setValorDaMoeda(0.0);
		

		
		chain1cent.debita(prod, moeda1);
		chain1cent.debita(prod, moeda2);
		chain1cent.debita(prod, moeda3);
		chain1cent.debita(prod, moeda4);
		chain1cent.debita(prod, moeda5);
		chain1cent.debita(prod, troco);
		
		
		
		ValorProd prod2 = new ValorProd();
		prod2.setValorProd(5.10);
		prod2.setValorAtual(5.10);
		prod2.setNomeProd("Refrigerante");
		
		

		System.out.println("");
		chain1cent.debita(prod2, moeda1);
		chain1cent.debita(prod2, moeda2);
		chain1cent.debita(prod2, moeda3);
		chain1cent.debita(prod2, moeda4);
		chain1cent.debita(prod2, moeda5);
		chain1cent.debita(prod2, troco);
		
		
	}
}
