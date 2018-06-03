package Observer.Noticia;
/**
 * 
 * @author Kaue victor Paz Garcia Mirkai.
 * Ra:81613004
 * Professor:Bonato
 * 			
 *
 */
public class ObserverNoticia implements ConsomeNoticia {
	public ObserverNoticia(NoticiarioAssina not) {
		this.sub = not;
		this.observerID = ++observerIDTracker;
		System.out.println("New observer " + this.observerID);
		not.register(this);
		// TODO Auto-generated constructor stub
	}

	private String textoNoticia;
	private int dia;
	private int mes;
	private String topico;

	private int observerID;

	private static int observerIDTracker = 0;

	private NoticiarioAssina sub;

	@Override
	public void notificaNoticia(String textoNoticia, int dia, int mes, String topico) {
		this.textoNoticia = textoNoticia;
		this.dia = dia;
		this.mes = mes;
		this.topico = topico;

	}

	@Override
	public String toString() {
		return "ObserverNoticia [textoNoticia=" + textoNoticia + ", dia=" + dia + ", mes=" + mes + ", topico=" + topico
				+ ", observerID=" + observerID + ", sub=" + sub + "]";
	}
	
	

}
