package basic.exercise;

import java.util.Arrays;

//Write a Java program to check if two given strings are anagrams of each other
public class Day3Q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st1 = "caree";
		String st2 = "racee";
		boolean IsAnagrams = false;

		if (st1.length() == st2.length()) {

			char[] c1 = st1.toLowerCase().toCharArray();
			char[] c2 = st2.toLowerCase().toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);

			if (Arrays.equals(c1, c2)) {
				IsAnagrams = true;
			}

		} else {
			IsAnagrams = false;
		}

		if (IsAnagrams)
			System.out.print("Given strings are anagrams");
		else
			System.out.print("Given strings are not anagrams");

	}

}
