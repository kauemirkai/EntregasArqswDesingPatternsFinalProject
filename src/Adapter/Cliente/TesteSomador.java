package Adapter.Cliente;

public class TesteSomador {

/**
 * 
 * @author Kaue victor Paz Garcia Mirkai.
 * Ra:81613004
 * Professor:Bonato
 * 			
 *
 */

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente(new SomadorAdapter());
		
	}
}
