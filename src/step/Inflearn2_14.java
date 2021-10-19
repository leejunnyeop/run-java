package step;

import java.util.Scanner;

public class Inflearn2_14 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int arr[] = new int [n];
		int arr1[] = new int [n];
		
		for(int i =0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		for(int y =0; y < n; y++ ) {
			arr1[y] = kb.nextInt();
		}
		for(int i =0; i < n; i++) {
			for(int y =0; y< n; y++) {
				if(arr[i] == arr1[y]) {
					int tmep = arr[i];
					arr[i] = arr1[y];
					arr1[y] = tmep;
					
				}
				System.out.println(arr[y]);
			}
		
		}
		
kb.close();
	}

}
