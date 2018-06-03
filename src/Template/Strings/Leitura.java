package Template.Strings;

/**
 * 
 * @author Kaue victor Paz Garcia Mirkai. Ra:81613004 Professor:Bonato
 * 
 *
 */

public abstract class Leitura {

	final String leitura() {
		String s = "Test";
		if (duplicateBool() == true) {
			return duplicate(s);
		}

		if (inverteBool() == true) {
			return inverte(s);
		}
		if (upperBool() == true) {
			return upper(s);

		}
		if (lowerBool() == true) {
			return lower(s);
		}
		return "";

	}
	
	abstract String inverte(String s);
	abstract String duplicate(String s);
	abstract String upper(String s);
	abstract String lower(String s);

	boolean inverteBool() {
		return true;
	}

	boolean duplicateBool() {
		return true;
	}

	boolean upperBool() {
		return true;
	}

	boolean lowerBool() {
		return true;
	}

}
