package basic.exercise;

/*Write a Java program to check if a given text is a rotation of another text
example : "aana" is rotation of "naaa"*/
public class Day3Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String st1 = "aana";
		String st2 = "naaa";
		String st3 = "";
		boolean isRotation = false;
		for (int i = 0; i < st1.length(); i++) {
			char x = st1.charAt(0);
			st1 = st1.substring(1);
			st1 = st1 + x;

			if (st1.equals(st2)) {

				isRotation = true;
				break;

			} else {
				isRotation = false;

			}

		}
		if (isRotation) {
			System.out.println("Given text is a rotation of another text");

		} else {
			System.out.println("Given text is not a rotation of another text");
		}
	}

}
