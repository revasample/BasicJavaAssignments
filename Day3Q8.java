package basic.exercise;

//count the number of words in a given string sentence
public class Day3Q8 {

	public static void main(String[] args) {
		String words = "Counting words in a string";
		int countWords = words.split("\\s").length;
		System.out.println(countWords);
	}

}
