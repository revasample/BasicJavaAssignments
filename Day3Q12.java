package basic.exercise;

//Write a Java program to capitalize the first letter of each word in a given string.

public class Day3Q12 {

	public static void main(String[] args) {
		
		String st = "write a java program";

		String[] arr = st.split(" ");
		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < arr.length; i++) {
			sb.append(Character.toUpperCase(arr[i].charAt(0))).append(arr[i].substring(1)).append(" ");
		}

		System.out.println(sb.toString().trim());

	}

}
