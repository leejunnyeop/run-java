package step;

import java.util.Scanner;

public class Inflearn2_07 {
	public static void main(String[] args) {
	Scanner kb = new Scanner(System.in);
	int n = kb.nextInt();
	int arr[] = new int[n];

	for(int i =0; i < n; i++) {
		arr[i] = kb.nextInt();
	
      }
	int answer = 0, cnt = 0;
	for(int  i=0; i < n; i++) {
		if(arr[i] == 1) {
			cnt ++;
			answer += cnt;	
	}
	else cnt =0;
	}
	System.out.println(answer);
	kb.close();
	}
}
