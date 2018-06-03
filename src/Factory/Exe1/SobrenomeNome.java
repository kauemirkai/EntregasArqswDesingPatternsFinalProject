package Factory.Exe1;

/**
 * 
 * @author Kaue victor Paz Garcia Mirkai.
 * Ra:81613004
 * Professor:Bonato
 * 			
 *
 */

public class SobrenomeNome implements Nome {
	private String sobrenome;
	private String nome;

	public SobrenomeNome(String sobrenome, String nome) {
		
		this.sobrenome = sobrenome;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	@Override
	public String printaNome() {

		// TODO Auto-generated method stu
		return "SobrenomeNome [Sobrenome=" + getSobrenome() + ", nome=" + getNome() + "]";
	}

}
