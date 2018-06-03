package Factory.Exe3;

/**
 * 
 * @author Kaue victor Paz Garcia Mirkai.
 * Ra:81613004
 * Professor:Bonato
 * 			
 *
 */
import javax.swing.JOptionPane;

public class ExecutarNumero {
	
	public static void main(String[] args) {
		
		String men = "";
		FabricaNumero fn = new FabricaNumero();
		
		men = JOptionPane.showInputDialog(null, "Digite qual arquivo deseja criar\n*Obs: arquivo ou console");
		fn.mostrar(men);
		
		
		System.exit(0);
	}

}
