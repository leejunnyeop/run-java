package main;

import java.util.Scanner;

public class Ch02 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int arr[] = new int[5];
		int max = arr[0];
		int min = arr[0];
		for(int i =0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		for(int s =0; s<n; s++) {
			if(arr[s] > max) {
				arr[s] += max;
				System.out.println(arr[s]);
			}else if(arr[s] < min) {
				arr[s] += min;
				System.out.println(arr[s]);
			}
		}
		
  kb.close();
	}

}
