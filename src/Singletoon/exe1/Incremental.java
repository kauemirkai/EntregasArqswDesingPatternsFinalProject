package Singletoon.exe1;
/**
 * 
 * @author Kaue victor Paz Garcia Mirkai.
 * Ra:81613004
 * Professor:Bonato
 * 			
 *
 */
public class Incremental {
	private static int count = 0;
	private int numero;

	public Incremental() {
		numero = ++count;
	}

	public String toString() {
		return "Incremental " + numero;
	}

}
