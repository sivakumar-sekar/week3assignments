package collectionsprogram;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "Shivaa";
		char[] str1 = text.toCharArray();
		System.out.println(str1);
		Set<Character> mentors =new HashSet<Character>();
		for (int i=0; i<str1.length-1; i++)  {
			mentors.add(str1[i]);
			System.out.println(str1[i]);
		}

	}

}


/*
 * Psuedocode
 * 
 * a) Convert String to Character array
 * b) Create a new Set -> HashSet
 * c) Add each character to the Set and if it is already there, remove it
 * d) Finally, print the set
 * 
 */