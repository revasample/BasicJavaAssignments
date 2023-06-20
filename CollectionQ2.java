package basic.exercise;

//Remove the duplicates character in the given string
import java.util.LinkedHashSet;


public class CollectionQ2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

        String string = "aabcdefacfa";

		char[] chars = string.toCharArray();
		LinkedHashSet<Character> charSet = new LinkedHashSet<Character>();
		System.out.println("after removing duplicate characters");
		for (char c : chars) {
		    charSet.add(c);
		}

		StringBuilder sb = new StringBuilder();
		for (Character character : charSet) {
		    sb.append(character);
		}
		System.out.println(sb.toString());
	}

}
