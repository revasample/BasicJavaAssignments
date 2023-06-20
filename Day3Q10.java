package basic.exercise;

//Write a Java program to remove given characters from the string?
public class Day3Q10 {
	
	 public static String charRemoveAt(String str, int p) {  
	        return str.substring(0, p) + str.substring(p + 1);  
	      
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    String str = "Java program";  
        System.out.println(charRemoveAt(str, 6));  
     }  
    

}
