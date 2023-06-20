package basic.exercise;

//find the index of given character or substring(first character index)
public class Day3Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="java Basic";
		int a=str.indexOf('a',4);
		int b=str.indexOf("Basic");
		System.out.println("index of character: "+a);
		System.out.println("index of substring: "+b);
	}

}
