package oncogene;

import java.util.ArrayList;

public class OncogeneDetector {
	/*
	 * Put letters into linked list
	 * At each letter, find the next and if needed next after and so on
	 * if(isNext) and if they are all true then it is a cancer sequence
	 */
	public boolean isOncogene(ArrayList<String> healthySequences, ArrayList<String> cancerSequences, String string) {
		/**
		 * Have an integer for amount  of cancer with trait and amount of healthy with trait
		 * Go through each, adding one to an int if it has the trait
		 * When done, divide, and check to see if greater
		 * If cancer > normal, it is cancer, else, not cancer
		 * Return true if it is cancer
		 */
		return false;
	}

}
