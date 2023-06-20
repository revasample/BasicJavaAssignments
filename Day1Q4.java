package basic.exercise;

//find the factorial of a given number
import java.util.Scanner;

public class Day1Q4 {

	public static void main(String[] args) {
		int fact=1,num;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter number: ");
		num=sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		
		System.out.println("Factorial of "+num+"is "+fact);
	}

}
