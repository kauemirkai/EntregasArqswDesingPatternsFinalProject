package Strategy.sort;
/**
 * 
 * @author Kaue victor Paz Garcia Mirkai.
 * Ra:81613004
 * Professor:Bonato
 * 			
 *
 */
public class Insertion implements SelecionaSort {

	@Override
	public int[] vetor(int[] v) {
		int i, j, x;
		for (j = 1; j < v.length; ++j) {
			x = v[j];
			for (i = j - 1; i >= 0 && v[i] > x; --i) {
				v[i + 1] = v[i];
			}
			v[i + 1] = x;
		}
		return v;
	}

}
