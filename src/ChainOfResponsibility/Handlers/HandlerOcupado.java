package ChainOfResponsibility.Handlers;
/**
 * 
 * @author Kaue victor Paz Garcia Mirkai.
 * Ra:81613004
 * Professor:Bonato
 * 			
 *
 */
public class HandlerOcupado implements Chain {

	private Chain nextInChain;

	@Override
	public void setNextChain(Chain nextChain) {
		this.nextInChain = nextChain;

	}

	public HandlerOcupado() {
	}

	@Override
	public void handleRequest(Handler handler) {
		

		
			System.out.println("Lamento, todos os handlers estão ocupados no momento, tente novamente daqui a pouco");
	
			
	}


}
