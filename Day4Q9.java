package basic.exercise;

//Add sum of the array to each element in the array
public class Day4Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,3,4,6,5};
		int sum=0;
		for(int i=0;i<=a.length-1;i++)
		{
			sum=sum+a[i];
			
		}
		
		System.out.println("Sum of array elements: " +sum);
	}

}
