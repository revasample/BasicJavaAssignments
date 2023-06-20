package basic.exercise;

//check if two strings are the same ignoring their cases.
public class Day3Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Java";
		String str2="jaVa";
		String str3="Java Script";
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str2.equalsIgnoreCase(str3));
	}

}
