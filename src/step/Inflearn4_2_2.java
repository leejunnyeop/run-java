package step;

import java.util.HashMap;
import java.util.Scanner;

public class Inflearn4_2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Character, Integer> map = new HashMap<>();
		Scanner kb = new Scanner(System.in);
		String a = kb.next();
		String b = kb.next();
		for(char x : a.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0)+1);
		}
		for(char x: b.toCharArray()) {
			if(!map.containsKey(x) || map.get(x) == 0) {
				System.out.println("NO");
			}else
				System.out.println("NO");
		}
    kb.close();
	}

}
