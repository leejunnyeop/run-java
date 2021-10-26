package step;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Inflearn4_2_1 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		String st = kb.next();
		HashMap<Character, Integer> map = new HashMap<>();
		for(char x : str.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0)+1);
		}
		for(char x : st.toCharArray()) {
			if(!map.containsKey(x) || map.get(x) == 0)
				System.out.println("NO");
				map.put(x, map.get(x)-1);
		}

	}

}
