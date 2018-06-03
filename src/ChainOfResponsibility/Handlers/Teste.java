package ChainOfResponsibility.Handlers;
/**
 * 
 * @author Kaue victor Paz Garcia Mirkai.
 * Ra:81613004
 * Professor:Bonato
 * 			
 *
 */
import java.util.concurrent.TimeUnit;

public class Teste {
	public static void main(String[] args) {
		Chain handler1 = new Handler1();
		Chain handler2 = new Handler2();
		Chain handler3 = new Handler3();
		Chain handler4 = new Handler4();
		Chain handler5 = new Handler5();
		Chain handler6 = new Handler6();
		Chain handlerOcupado = new HandlerOcupado();
		
		
		
		handler1.setNextChain(handler2);
		handler2.setNextChain(handler3);
		handler3.setNextChain(handler4);
		handler4.setNextChain(handler5);
		handler5.setNextChain(handler6);
		handler6.setNextChain(handlerOcupado);
		
		
		Handler request = new Handler();
			
	/*	
		handler1.handleRequest(request);		
		handler1.handleRequest(request);	
		handler1.handleRequest(request);
		
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		handler1.handleRequest(request);
		handler1.handleRequest(request);
		handler1.handleRequest(request);
		try {
			TimeUnit.MILLISECONDS.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		handler1.handleRequest(request);
		handler1.handleRequest(request);
		handler1.handleRequest(request);
		
		try {
			TimeUnit.MILLISECONDS.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		handler1.handleRequest(request);
		
		try {
			TimeUnit.MILLISECONDS.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		handler1.handleRequest(request);
		handler1.handleRequest(request);
*/
		
		handler1.handleRequest(request);
		handler1.handleRequest(request);
		handler1.handleRequest(request);
		handler1.handleRequest(request);

		
		handler1.handleRequest(request);
		handler1.handleRequest(request);
		handler1.handleRequest(request);
		
	}
}
