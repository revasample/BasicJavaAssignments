package basic.exercise;

//check the given string is palindrome or not
public class Day4Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st="radar";
		int a=st.length();
		String revSt="";
		
		for(int i=a-1;i>=0;i--) {
			st.charAt(i);
			revSt=revSt+st.charAt(i);			
		}
				
		if(st.equals(revSt)) {
			System.out.println("given string is a palindrome: " +st);
			
		}else
			System.out.println("given string is not a palindrome: " +st);
			
	}

}
