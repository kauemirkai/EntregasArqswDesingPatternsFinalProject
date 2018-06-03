package Template.Strings;
/**
 * 
 * @author Kaue victor Paz Garcia Mirkai.
 * Ra:81613004
 * Professor:Bonato
 * 			
 *
 */
public class Lower extends Leitura{

	

	@Override
	String lower(String s) {
		s = s.toLowerCase();
		return s;
	}

	@Override
	String inverte(String s) {
		// TODO Auto-generated method stub
		return null;
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
	boolean inverteBool() {
		return false;
	}

	boolean duplicateBool() {
		return false;
	}

	boolean upperBool() {
		return false;
	}

	boolean lowerBool() {
		return true;
	}


}
