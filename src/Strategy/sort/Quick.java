package Strategy.sort;
/**
 * 
 * @author Kaue victor Paz Garcia Mirkai.
 * Ra:81613004
 * Professor:Bonato
 * 			
 *
 */
public class Quick implements SelecionaSort {
	@Override
	public int[] vetor(int[] v) {
		quicksort(v, v[0], v[v.length-1]);
		return v;
	}

	private int separa(int v[], int p, int r) {
		int c = v[p + ((int) (Math.random() * (1 + r - p) * 1000) % (1 + r - p))];
		int i = p + 1, j = r, t;
		while (true) {
			while (i <= r && v[i] <= c)
				++i;
			while (c < v[j])
				--j;
			if (i >= j)
				break;
			t = v[i];
			v[i] = v[j];
			v[j] = t;
			++i;
			--j;
		}
		v[p] = v[j];
		v[j] = c;
		return j;
	}

	/*
	 * Quicksort - principal (chama o metodo separa)
	 */
	public void quicksort(int v[], int p, int r) {
		int j;
		if (p < r) {
			j = separa(v, p, r);
			quicksort(v, p, j - 1);
			quicksort(v, j + 1, r);
		}
	}
}
