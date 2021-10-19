package step;

import java.util.Scanner;

public class Inflearn2_08 {
	public static void main(String[] args) {
	Scanner kb = new Scanner(System.in);
	int n = kb.nextInt();
	int arr[] = new int[n];
	int answer[] = new int [n];
	for(int i =0; i < n; i++) {
		arr[i] = kb.nextInt();
	}
	for(int  i=0; i < n; i++) {
		int cnt = 1;
		for(int j =0; j < n; j++) {
			if(arr[j] > arr[i]) 
				cnt++;
		}
			answer [i] = cnt;
		
	}
	
	System.out.println(answer);
	kb.close();
	}
}
