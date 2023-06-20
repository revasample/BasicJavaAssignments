package basic.exercise;

//WJP to Store 5 integer values in linkedlist and sort in ascending order.
import java.util.LinkedList;

public class CollectionQ6 {
	
	public static void bubbleSort(LinkedList<Integer> ob) {
		int temp;
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++){
				if(ob.get(j)>ob.get(j+1)) {
					temp=ob.get(j);
					ob.set(j, ob.get(j+1));
					ob.set(j+1,temp);
				}
					
			}
			
		}
		System.out.println(ob);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ob=new LinkedList<Integer>();
		ob.add(11);
		ob.add(23);
		ob.add(14);
		ob.add(26);
		ob.add(18);
		
		System.out.println(" Integer values in ascending order ");
		bubbleSort(ob);

	}

}
