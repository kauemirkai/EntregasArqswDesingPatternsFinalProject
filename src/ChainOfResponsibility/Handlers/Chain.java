package ChainOfResponsibility.Handlers;
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
	
	public void handleRequest(Handler handler);
	

}
