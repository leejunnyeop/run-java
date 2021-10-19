package step;


import java.util.Scanner;
import java.util.StringTokenizer;

public class Inflearn4_1_1 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int answer =0;
		int n = kb.nextInt();
		String st[] = new String[n];
		for(int i =0; i < n; i++) {
			st[i] = kb.nextLine();
		}
		for(int i =0; i < n; i++) {
			answer = 0;
			for(int y =1; y < n; y++) {
				if( st[i] == st[y]) {
					answer ++;
				}
			}
			kb.close();
		}
	}

