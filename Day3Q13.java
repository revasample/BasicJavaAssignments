package basic.exercise;

//Write a Java program to find all the substrings of a given string.
public class Day3Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st="java";
		for(int i=0;i<st.length();i++) {
			for(int j=i+1;j<=st.length();j++) {
				System.out.println(st.substring(i, j));
				
			}
			
		}
	}

}
