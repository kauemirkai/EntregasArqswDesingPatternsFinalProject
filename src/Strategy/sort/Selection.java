package Strategy.sort;
/**
 * 
 * @author Kaue victor Paz Garcia Mirkai.
 * Ra:81613004
 * Professor:Bonato
 * 			
 *
 */
public class Selection implements SelecionaSort {

	@Override
	public int[] vetor(int[] v) {
		int i, j, min, x;
		for (i = 0; i < v.length - 1; ++i) {
			min = i;
			for (j = i + 1; j < v.length; ++j) {
				if (v[j] < v[min])
					min = j;
			}
			x = v[i];
			v[i] = v[min];
			v[min] = x;
		}
		return v;
	}

}
