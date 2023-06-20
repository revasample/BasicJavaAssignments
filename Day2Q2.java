package basic.exercise;

//To find the given year is leap year or not(include century year also)
public class Day2Q2 {

	int year;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int year=2010;		
		if(year%400==0) {
			System.out.println("Given year is a leap year");
			
		}else if(year%100==0) {
			System.out.println("Given year is not a leap year");
		}
		else if(year%4==0) {
			System.out.println("Given year is a leap year");
		}
		else 
			System.out.println("Given year is not a leap year");
		
	}

}
