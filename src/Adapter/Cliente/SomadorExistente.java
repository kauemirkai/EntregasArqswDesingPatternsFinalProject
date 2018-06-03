package Adapter.Cliente;

import java.util.List;

/**
 * 
 * @author Kaue victor Paz Garcia Mirkai.
 * Ra:81613004
 * Professor:Bonato
 * 			
 *
 */

public class SomadorExistente {
	public int somaLista(List<Integer> lista) {
		int resultado = 0;
		for (int i : lista)
			resultado += i;
		return resultado;
	}
}