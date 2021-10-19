package step;

import java.util.HashMap;
import java.util.Scanner;

public class Inflearn4_1 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n =kb.nextInt();
		String str = kb.next();
		char answer =' '; //단어 하나만 받기
		HashMap<Character, Integer> map = new HashMap<>();
		// <키, value>
		//map.put('A', 3);
		for(char x: str.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0)+1);// x는 string내부를 돌아서 그 단어로 변화고 없으면 0
			
		}
		int max = Integer.MAX_VALUE;
		for(char key : map.keySet()) {
			if(map.get(key) > max)
				answer = key;
		}
		System.out.println(answer);
      kb.close();
	}

}
