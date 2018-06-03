package Factory.Exe1;

/**
 * 
 * @author Kaue victor Paz Garcia Mirkai.
 * Ra:81613004
 * Professor:Bonato
 * 			
 *
 */

public class Factory {
	private boolean flag = true;

	public Nome retorno(String nome, String sobrenome) {
		if (flag) {
			flag = false;
			return new NomeSobrenome(nome, sobrenome);

		}

		else {
			flag = true;
			return new SobrenomeNome(sobrenome, nome);

		}
	}
	
	public boolean getFlag() {
		return flag;
	}

}
