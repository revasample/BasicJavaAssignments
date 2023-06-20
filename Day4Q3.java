package basic.exercise;

import java.util.Arrays;

//find unique elements in the array
public class Day4Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a[]= {1,1,2,3,4,6,5,3,7,8,5,8};
		 		 
	     for(int i =0;i<a.length;i++)
	     {
	         boolean isUnique=false;
	         for(int j=0;j<i;j++)
	         {
	             if(a[j]==a[i])
	             {
	            	 isUnique=true;
	                 break;
	             }
	         }
	         if(!isUnique)
	         {
	             System.out.print(a[i]+" ");
	         }
	     }		 
	}

}
