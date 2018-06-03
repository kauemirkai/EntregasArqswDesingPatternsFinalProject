package AbstractFactory.Calzone;
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
		AbstractPizzaria fabrica = new Pizzaria();
		
		Pizza pizza = fabrica.getFactory(DiaSemana.SEGUNDA);
		System.out.println(pizza.fazer());
		
		pizza = fabrica.getFactory(DiaSemana.TERCA);
		System.out.println(pizza.fazer());
		
		fabrica = new Calzonaria();
		
		pizza = fabrica.getFactory(DiaSemana.QUARTA);
		System.out.println(pizza.fazer());
		
		pizza = fabrica.getFactory(DiaSemana.QUINTA);
		System.out.println(pizza.fazer());
		

	}

}
