package step;

import java.util.Scanner;

public class Inflearn2_09 {
	public static void main(String[] args) {
	Scanner kb = new Scanner(System.in);
	int answer1=-2147000000;
	int n = kb.nextInt();
	//int answer1 = Integer.MAX_VALUE; //
	int sum1, sum2;
	int arr[][] = new int[n][n];
	for(int i =0; i < n; i++) {
		for(int j =0; j < n; j++) {
		arr[i][j] = kb.nextInt();
	}		
	}
	for(int  i=0; i < n; i++) {
		sum1=sum2=0;
		for(int j =0; j < n; j++) {
			sum1+=arr[i][j];
			sum2+=arr[j][i];
		}
			answer1 = Math.max(answer1, sum1);// 둘 중에 큰 값이 answer1 들어간다
			answer1 = Math.max(answer1, sum2);
	}
	sum1=sum2=0;
	for(int i=0; i < n; i++) {
		sum1+=arr[i][i];  // 대각선
		sum2+=arr[i][n - i -1];
	}
	answer1 = Math.max(answer1, sum1);
	answer1 = Math.max(answer1, sum2);
	System.out.println(answer1);
	kb.close();
	}
}
