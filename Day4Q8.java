package basic.exercise;

//Move all even numbers to the beginning of the array.
public class Day4Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5,7,6,3,2,8};
		int i=0;
		for(int j=0;j<a.length;j++) {
			if(a[j]%2==0) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
			}
		}
		System.out.print("Even numbers to front= ");
		for(int j=0;j<a.length;j++) {
			System.out.print(a[j]+" ");
			
		}

	}    
		 
}
