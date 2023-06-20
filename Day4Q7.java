package basic.exercise;

import java.util.HashMap;
import java.util.Map;

//find the frequency of each character in the given string
public class Day4Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aaabbbcca";

		char[] charArray = s.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for (char c : charArray) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
	}
}
