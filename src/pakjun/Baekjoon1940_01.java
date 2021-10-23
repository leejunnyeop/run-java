package pakjun;

import java.util.Scanner;

public class Baekjoon1940_01 {

	public static void main(String[] args) {
	Scanner kb = new Scanner(System.in);
	int n = kb.nextInt();
	int m = kb.nextInt();
	int []arr = new int [n];
	for(int i=0; i < n; i++) {
		arr[i] = kb.nextInt();
	}
	int p1 = 0, p2=0, sum =0, answer= 0;
	while(p1 == m) {
	 sum += arr[p1];
	 if(m == sum) {
		answer++;
		sum =0;
		p1++;
	 }
	 else if (m > sum) {
		 p1++;
	 }
	 else {
		 sum -= arr[p2];
		 p2++;
		 p1++;
	 }
	}
	System.out.println(answer);
	kb.close();
	}
}