package ChainOfResponsibility.SlotMachine;
/**
 * 
 * @author Kaue victor Paz Garcia Mirkai.
 * Ra:81613004
 * Professor:Bonato
 * 			
 *
 */
public interface Chain {
	
	public void setNextChain(Chain nextChain);
	
	public void debita(ValorProd valorProd, ValorMoeda valorMoeda);
	

}
