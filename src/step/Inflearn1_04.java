package step;

import java.util.ArrayList;
import java.util.Scanner;

public class Inflearn1_04 {

	public static void main(String[] args) {
		ArrayList<String> answer = new ArrayList<>();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String str[] = new String[n];
		for(int i =0; i < n; i++) {
			str[i] = kb.next();
		}
		for(String x : str) {
			String tmp = new StringBuilder(x).reverse().toString(); //문자열 객체 생성
		    answer.add(tmp);
		    
		
		}
        System.out.println(answer);
        kb.close();
	}

}
