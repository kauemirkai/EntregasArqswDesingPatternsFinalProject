package Factory.Exe1;

/**
 * 
 * @author Kaue victor Paz Garcia Mirkai.
 * Ra:81613004
 * Professor:Bonato
 * 			
 *
 */

public class NomeSobrenome implements Nome {
	private String sobrenome;
	private String nome;
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

	

	public NomeSobrenome(String nome, String sobrenome) {
		
		this.sobrenome = sobrenome;
		this.nome = nome;
	}

	@Override
	public String printaNome() {
		// TODO Auto-generated method stub
		return "nomeSobrenome [nome=" + getNome() + ", sobrenome=" + getSobrenome() + "]";
	}

}
