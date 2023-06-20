package basic.exercise;

//add all the elements in the given array of size n
public class Day4Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {2,8,4,1,6};
		int sum=0;
		for(int i=0;i<=a.length-1;i++) {
			sum=sum+a[i];
			
		}
		System.out.println("sum of array elements:" +sum);
		
	}

}
