package basic.exercise;

/*Create the student class with id name phonenumber country 
create constructors
read the data from user
store 5 student object
//and print the details in the console*/

import java.util.Scanner;
//import basic.Student;

public class Day2Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Day2Q5Const[] stuArray=new Day2Q5Const[5];
		
		for(int i=0;i<stuArray.length;i++) {    
			   stuArray[i]=new Day2Q5Const();
			   System.out.println("Enter value for "+i+" index student");
			   
			   System.out.println("Enter id");
			   stuArray[i].id=sc.nextInt();
			   
			   System.out.println("Enter name");
			   stuArray[i].name=sc.next();
			   
			   System.out.println("Enter phone number");
			   stuArray[i].phonenumber=sc.nextLong();
			   
			   System.out.println("Enter country");
			   stuArray[i].country=sc.next();
			}
			
			for(int i=0;i<stuArray.length;i++) {   
				System.out.println(stuArray[i]);
			}
		
		
	}

}
