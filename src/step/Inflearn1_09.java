package step;


import java.util.Scanner;

public class Inflearn1_09 {

	public static void main(String[] args) {
	int answer =0;
	Scanner kb = new Scanner(System.in);
	String str = kb.next();
	char ch[] = str.toCharArray();
	for(int i =0; i< ch.length; i++) {
		if(ch[i] >= 48 && ch[i] <= 57) {
			answer = answer *10 + (ch[i] - 48);
		}
	}
	System.out.println(answer);
	kb.close();
}
}