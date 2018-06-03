package Template.arrays;
/**
 * 
 * @author Kaue victor Paz Garcia Mirkai.
 * Ra:81613004
 * Professor:Bonato
 * 			
 *
 */
import java.util.Arrays;

public class Sort extends Template{

	@Override
	int[] sort(double[] x) {

		int parteInteira = 0;
		int parteFlutuante = 0;
		int[] array = new int[x.length];
		for (int i=0; i<x.length; i++) {
			 parteInteira = (int)x[i];
			 parteFlutuante = (int) ((x[i] - parteInteira)*10);
			 array[i] = parteFlutuante;
			 System.out.println(parteFlutuante);
		}
		Arrays.sort(array);
		Arrays.toString(array);
		return array;
	}

	private boolean sortBol() {
		// TODO Auto-generated method stub
		return true;
	}

}
