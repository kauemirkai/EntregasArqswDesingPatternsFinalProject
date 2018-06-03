package Factory.Exe1;

/**
 * 
 * @author Kaue victor Paz Garcia Mirkai.
 * Ra:81613004
 * Professor:Bonato
 * 			
 *
 */

public class Teste {
	public static void main(String[] args) {
		Factory fac = new Factory();
		System.out.println(fac.retorno("pa","ulo").printaNome());
		System.out.println(fac.getFlag());
		System.out.println(fac.retorno("jo","se").printaNome());
		System.out.println(fac.getFlag());
		System.out.println(fac.retorno("car","los").printaNome());
		System.out.println(fac.getFlag());
		System.out.println(fac.retorno("eu","l").printaNome());
		System.out.println(fac.getFlag());
		System.out.println(fac.retorno("ka","ue").printaNome());
		
		

		
	}
}
