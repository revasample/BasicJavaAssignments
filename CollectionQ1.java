package basic.exercise;

//Find frequency of each character in a string
import java.util.HashMap;

public class CollectionQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
		String s = "java";
		System.out.println("frequency of character in astring");
		for (int i = 0; i < s.length(); i++) {
		    char ch = s.charAt(i);
		     if (charMap.containsKey(ch)) {
		       int count=charMap.get(ch);
		       count++;
		       charMap.replace(ch, count);
		    }
		    else {
		       charMap.put(ch, 1); 
		   }
		}
		for(Character key : charMap.keySet()) {
		System.out.println(key+" ="+charMap.get(key));
		
		}
	}

}
