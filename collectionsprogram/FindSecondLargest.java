package collectionsprogram;

import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {
	public static void main(String[] args) {
		
	
	// Here is the input
	int[] data = {3,2,11,4,6,7,2,3,3,6,7};
	//       output= 7;
	Set <Integer> mentors = new TreeSet<Integer>();
	for (Integer e : data) {
		mentors.add(e);
		System.out.println(mentors);
	}

	/*
	 * Pseudo Code: 
	 * a) Create a empty Set Using TreeSet
	 * b) Declare for loop iterator from 0 to data.length and add into Set 
	 * c) converted Set into List
	 * d) Print the second last element from List
	 * 
	 * 
	 */

}
}