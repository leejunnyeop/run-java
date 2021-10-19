package main;

import java.util.Scanner;

public class Ch03 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int arr[] = new int [10];
		int total =0;
		for(int i =0; i < 10; i++) {
			arr[i] = kb.nextInt();
			arr[i] = arr[i] % 42;
		}
		for(int i =0; i < 10; i++)
			for(int y = 1; y < 10; y++) {
				if(arr[i] != arr[y]) {
					total ++;
				}
			}
		System.out.println(total);
  kb.close();
	}

}
