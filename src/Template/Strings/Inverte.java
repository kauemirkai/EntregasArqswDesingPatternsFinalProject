package Template.Strings;
/**
 * 
 * @author Kaue victor Paz Garcia Mirkai.
 * Ra:81613004
 * Professor:Bonato
 * 			
 *
 */
public class Inverte extends Leitura {

	@Override
	String inverte(String s) {
		String inv="";
		for(int x=s.length()-1;x>=0;x--){
            inv+= s.charAt(x);
        }
       return inv;
	}


	@Override
	String duplicate(String s) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	String upper(String s) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	String lower(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	boolean inverteBool() {
		return true;
	}

	boolean duplicateBool() {
		return false;
	}

	boolean upperBool() {
		return false;
	}

	boolean lowerBool() {
		return false;
	}

	
}
