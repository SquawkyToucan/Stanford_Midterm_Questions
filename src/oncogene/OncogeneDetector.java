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
		System.out.println("Testing: " + string);
		int healthyWithTrait = 0;
		int cancerWithTrait = 0;
		for(int i = 0; i < healthySequences.size(); i++) {
			if(healthySequences.get(i).contains(string)) {
				healthyWithTrait++;
				System.out.println("Detected string in " + healthySequences.get(i));
			}
		}
		double healthyPercentage = healthyWithTrait * 100 / healthySequences.size();
		for(int i = 0; i < cancerSequences.size(); i++) {
			if(cancerSequences.get(i).contains(string)) {
				cancerWithTrait++;
				System.out.println("Detected string in " + cancerSequences.get(i));
			}
		}
		System.out.println(cancerWithTrait + " out of " + cancerSequences.size() + " have been detected with cancer, " + healthyWithTrait + " out of " + healthySequences.size() + " have been detected without");
		double cancerPercentage = cancerWithTrait * 100 / cancerSequences.size();
		System.out.println("Cancer Percentage: "  + cancerPercentage + " Normal Percentage: " + healthyPercentage);
		if(cancerPercentage > healthyPercentage) {
			return true;
		}
		return false;
	}

}
