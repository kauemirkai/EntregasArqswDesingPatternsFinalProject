package ChainOfResponsibility.Handlers;
/**
 * 
 * @author Kaue victor Paz Garcia Mirkai.
 * Ra:81613004
 * Professor:Bonato
 * 			
 *
 */
public class Handler2 implements Chain {
	private long milis;
	private Chain nextInChain;
	private boolean processei=false;

	@Override
	public void setNextChain(Chain nextChain) {
		this.nextInChain = nextChain;

	}

	public Handler2() {
		this.milis = System.currentTimeMillis();
	}

	@Override
	public void handleRequest(Handler handler) {
		

		if (getFlag(handler)) {

		/*	System.out.println((System.currentTimeMillis() - getMilis()));
			System.out.println(System.currentTimeMillis());
			System.out.println(getMilis());
			*/
			System.out.println("Eu sou o handler: " + "2" + " E estou atendendo sua requisição");
	
			

		}

		else {
			
			nextInChain.handleRequest(handler);

		}

	}

	public long getMilis() {
		return milis;
	}

	public void setMilis(long milis) {
		this.milis = milis;
	}

	public boolean getFlag(Handler handler) {
		if ((System.currentTimeMillis() - this.milis) < 200 && processei == false) {
			this.milis = System.currentTimeMillis();
			processei = true;
			return true;
			
		} 
	
		else if ((System.currentTimeMillis() - this.milis) >200 && processei == true){
			this.milis = System.currentTimeMillis();
			processei = true;
			return true;
		
		}
		
		else {
			return false;
		}
		
	}

}
