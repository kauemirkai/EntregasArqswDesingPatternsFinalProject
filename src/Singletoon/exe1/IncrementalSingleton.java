package Singletoon.exe1;
/**
 * 
 * @author Kaue victor Paz Garcia Mirkai.
 * Ra:81613004
 * Professor:Bonato
 * 			
 *
 */
public class IncrementalSingleton {
	private static IncrementalSingleton instance;
	private static int count = 0;
	private int numero;

	private IncrementalSingleton() {
		numero = ++count;
	}

	public static IncrementalSingleton getInstance() {
		if (instance == null) {
			instance = new IncrementalSingleton();
		}
		return instance;
	}
	
	public String toString() {
		return "IncrementalSingleton " + numero;
	}

}
