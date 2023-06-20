package basic.exercise;

import java.util.Arrays;

//find maximum element in the array
public class Day4Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int arr[]={6,3,9,13,24,34,46};
         Arrays.sort(arr);
         System.out.println("Largest number from given array: "+arr[arr.length-1]);
	}

}
