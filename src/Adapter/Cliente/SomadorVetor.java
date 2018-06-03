package Adapter.Cliente;

public class SomadorVetor implements SomadorEsperado {

	@Override
	public int somaVetor(int[] vetor) {
		int soma = 0;
		for (int i = 0; i < vetor.length; i++) {
			soma = vetor[i] + soma;

		}
		return soma;

	}

}
