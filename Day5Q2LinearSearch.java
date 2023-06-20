package basic.exercise;

//search an given key in the array of size n using linear search
public class Day5Q2LinearSearch {

	static int arr[] = { 11, 12, 14, 13, 16 };

	static int linearsearch(int arr[], int size, int key) {
		if (size == 0) {
			return -1;
		} else if (arr[size - 1] == key) {

			return size - 1;
		} else {
			return linearsearch(arr, size - 1, key);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int key = 13;

		int index = linearsearch(arr, arr.length, key);
		if (index != -1)
			System.out.println("The element " + key + " is found at " + index + " index of the given array.");

		else
			System.out.println("The element " + key + " is not found.");
	}

}
