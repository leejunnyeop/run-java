package main;

import java.util.Scanner;

public class Ch06 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int answer =0;
		String num = kb.nextLine();// nextLine는 엔터 치기 전까지, next는 스페이스바 치는 곳 까지
		char ch = num.charAt(0); //num에 첫번째 단어 반환
		if(ch != ' ') answer ++;
		for(int i =1; i < num.length(); i++) {
			char now = num.charAt(i);
			if(ch == ' ' && now != ' ') {
				answer++;
				ch = now;
			}
			else if(ch != ' ' && now == ' ')
				ch = now;
			
			else continue;
		}
		System.out.println(answer++);
		kb.close();
	}
}


	