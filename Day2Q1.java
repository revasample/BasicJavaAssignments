package basic.exercise;

//To find the fibbonacci series of size n

public class Day2Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=6,f=1,s=1,t;
		System.out.println(f);
		System.out.println(s);
		for(int i=3;i<=n;i++) {
			t=f+s;
			System.out.println(t);
			f=s;
			s=t;
		}
		
		System.out.println("");
		
	}

}
