package animal_hipster;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;

public class AnimalHipster {

	public AbstractCollection<String> findAnimalHipsters(HashMap<String, ArrayList<String>> network,
			HashMap<String, String> favoriteAnimals) {
		// Go through each person
		// Check all friends
		// If friend has same, disqualify
		// If gone through all friends and none has same animal, add to collection
		AbstractCollection<String> hipsters = new ArrayList<>();
		String name;
		System.out.println("beginnning a test");
		for (int i = 0; i < network.keySet().size(); i++) {
			boolean isHipster = true;
			name = (String) network.keySet().toArray()[i];
			System.out.println("testing " + name);
			for(int j = 0; j < network.get(name).size(); j++) {
				String nameBeingChecked = network.get(name).get(j);
				System.out.println("checking " + name + " against " + nameBeingChecked);
				if(favoriteAnimals.get(nameBeingChecked).equals(favoriteAnimals.get(name))) {
					// Remove them, as it is impossible for them to be hipsters
					isHipster = false;
					System.out.println(name + " has been removed from contention along with " + nameBeingChecked);
				}
			}
			if(isHipster) {
				hipsters.add(name);
			}
		}
		
		return hipsters;
	}

}
