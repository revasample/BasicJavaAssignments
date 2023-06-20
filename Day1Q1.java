package basic.exercise;

//swap two numbers with and without using third variable
import java.util.Scanner;

public class Day1Q1 {

	public static void main(String[] args) {
//		without using third variable
		int a, b;
		System.out.print("Enter any two numbers: ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();

		System.out.println("Before swapping: " + a + " " + b);
		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("After Swapping: " + a + " " + b);
//		sc.close();

//		with using third variable
		int x, y, temp;
		System.out.print("Enter any two numbers: ");
		Scanner ob = new Scanner(System.in);
		x = ob.nextInt();
		y = ob.nextInt();

		System.out.println("Before swapping: " + x + " " + y);
		temp = x;
		x = y;
		y = temp;

		System.out.println("After Swapping: " + x + " " + y);
		sc.close();

	}

}
