package basic.exercise;

// Print following patterns
import java.util.Scanner;

public class Day2Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		printpattern1(sc.nextInt());
		System.out.println("Enter the number");
		printpattern2(sc.nextInt());
		System.out.println("Enter the number");
		printpattern3(sc.nextInt());
	}

//		a. If n=4 then   o/p= 6 9 12 15
	public static void printpattern1(int n) {
		int num = 6;

		for (int i = 0; i < n; i++) {
			
       System.out.print(num + ",");
       num += 3;
		}
		System.out.println("");
	}

//		b. if n=5 then   o/p= 1,4,7,10,13
	public static void printpattern2(int n) {
		int num = 1;
		for (int i = 0; i < n; i++) {
			System.out.print(num + ",");
			num += 3;
		}
		System.out.println("");
	}

//		c. If n=5 then   o/p= 0,4,8,12,16
	public static void printpattern3(int n) {
		int num = 0;
		for (int i = 0; i < n; i++) {
			System.out.print(num + ",");
			num += 4;
		}

	}
}
