package basic.exercise;

//find the maximum of two and maximum of three numbers
import java.util.Scanner;

public class Day1Q2 {

	public static void main(String[] args) {
//		maximum of two numbers
		int a,b;
		System.out.print("Enter two numbers:");
		Scanner sc= new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		
		System.out.println("maximum number is: " +Math.max(a,b));
		
//		maximum of three numbers
		int x,y,z;
		Scanner key = new Scanner(System.in); 
	     System.out.print("Enter three numbers:");
	     x=sc.nextInt();
	     y=sc.nextInt();
	     z=sc.nextInt();
	     if (y > x) {
	         x = y;
	      }
	      if (z > x) {
	         x = z;
	      }
	     System.out.println("maximum number is: " +x);
	       
	    }
	
	}


