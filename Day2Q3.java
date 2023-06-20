package basic.exercise;

//find area of square and rectangle using overloading
import java.util.Scanner;

public class Day2Q3 {

	public void areaOfSquare(int side) {
		int area = 0;
		System.out.println();
		area = side * side;
		System.out.println("Area of the square is :" + area);
	}

	public void areaOfRectangle(int width, int height) {
		int area = 0;
		System.out.println();
		area = (width * height);
		System.out.println("Area of the rectangle is :" + area);
	}

	public static void main(String[] args) {

//		area of square using method overloading
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a value");

		Day2Q3 Ob = new Day2Q3();
		int side = s.nextInt();
		Ob.areaOfSquare(side);

		System.out.println("Enter two values");
		int width = s.nextInt();
		int height = s.nextInt();

		Ob.areaOfRectangle(width, height);

	}

}
