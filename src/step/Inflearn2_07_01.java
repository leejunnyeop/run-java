package step;

import java.util.Scanner;

public class Inflearn2_07_01 {
	public static void main(String[] args) {
	int cnt =0, answer =0;
	Scanner kb = new Scanner(System.in);
	int n = kb.nextInt();
	int []arr = new int [n];
	for(int i=0; i < n; i++) {
		arr[i] = kb.nextInt();
	}
	for(int i=0; i < n; i++) {
		if(arr[i] == 1) {
		cnt ++;
		answer += cnt;
		}else {
			cnt =0;
	}
	}
	System.out.println(answer);
	kb.close();
	}
}
