package basic.exercise;

public class Day5Q3BubbleSort {

	void bubbleSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					// swap arr[j+1] and arr[j]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
	}

	/* Prints the array */
	void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day5Q3BubbleSort ob = new Day5Q3BubbleSort();
		int arr[] = { 5, 1, 4, 2, 8 };
		ob.bubbleSort(arr);
		System.out.println("Bubble Sorted array");
		ob.printArray(arr);
	}

}
