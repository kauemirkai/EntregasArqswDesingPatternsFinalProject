package Observer.Noticia;
/**
 * 
 * @author Kaue victor Paz Garcia Mirkai.
 * Ra:81613004
 * Professor:Bonato
 * 			
 *
 */

public class NoticiaTeste {
	public static void main(String[] args) {
		
		NoticiarioAssina not = new NoticiarioAssina();
	
		
		System.out.println(not);
		ObserverNoticia obs = new ObserverNoticia(not);
		
		
		
		not.setTextoNoticia("noticia1");
		not.setDia(1);
		not.setMes(4);	
		not.setTopico("Caminhão");
		
		System.out.println(not);

		
	}

}
