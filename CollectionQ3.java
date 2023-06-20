package basic.exercise;

//Given a string, write a Java program to find all the unique words in the string
import java.util.HashSet;

public class CollectionQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "i am revathi , i am in training";
		HashSet<String> myset = new HashSet<>();
		System.out.println("unique words in a string :");
		String s[] = str.split(" ");

		for (int i = 1; i < s.length; i++) {

			myset.add(s[i]);

		}

		for (String s1 : myset) {
			
			System.out.println(s1);

		}
	}

}
