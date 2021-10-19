package step;

import java.util.HashMap;
import java.util.Scanner;

public class Inflearn4_1 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n =kb.nextInt();
		String str = kb.next();
		char answer =' '; //�ܾ� �ϳ��� �ޱ�
		HashMap<Character, Integer> map = new HashMap<>();
		// <Ű, value>
		//map.put('A', 3);
		for(char x: str.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0)+1);// x�� string���θ� ���Ƽ� �� �ܾ�� ��ȭ�� ������ 0
			
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
