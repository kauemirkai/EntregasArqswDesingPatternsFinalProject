package Adapter.Cliente;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Kaue victor Paz Garcia Mirkai.
 * Ra:81613004
 * Professor:Bonato
 * 			
 *
 */


public class SomadorAdapter extends SomadorExistente implements SomadorEsperado{

	@Override
	public int somaVetor(int[] vetor) {
		List<Integer> lista = new ArrayList<Integer>();
		for (int i = 0 ; i<vetor.length;i++) {
			lista.add(i);
		}
		return somaLista(lista);
	}

}
