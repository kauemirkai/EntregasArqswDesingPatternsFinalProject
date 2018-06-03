package Observer.Noticia;
/**
 * 
 * @author Kaue victor Paz Garcia Mirkai.
 * Ra:81613004
 * Professor:Bonato
 * 			
 *
 */
public interface Subject {
	
	public void register(ConsomeNoticia connot);
	public void unregister(ConsomeNoticia connot);
	public void notifyObserver();
	

}
