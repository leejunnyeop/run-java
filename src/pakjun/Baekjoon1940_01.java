package pakjun;

import java.util.Scanner;

public class Baekjoon1940_01 {

	public static void main(String[] args) {
	Scanner kb = new Scanner(System.in);
	int answer =0, sum =0;
	int n =kb.nextInt();
	int m = kb.nextInt();
	int []arr = new int [n];
	for(int i=0; i <n; i++) {
		arr[i] = kb.nextInt();
	}
	for(int i =0; i < n; i++) {
		for(int y=i+1; y < n; y++) {
			 sum = arr[i] + arr[y];
			if(m == sum)
				answer ++;
		}
	}
	System.out.println(answer);
	kb.close();
	}
}