package pakjun;


import java.util.Scanner;


public class Step02 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int [n];
		for(int i =0; i < n; i++) {
			arr [i] = kb.nextInt();
		}
		int tmp =0;
		for(int i=0; i < 4; i++) {
			for(int y=1; y < n; y++ ) {
				if(arr[i] > arr[y]) {
				    tmp = arr[i];
					arr[i] = arr[y];
					arr[y] = tmp;
				}
			}
		}
		for(int i =0; i < n; i++) {
		System.out.println(arr[i]);
		}
		kb.close();
	}
}

	
