package pakjun;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon1037_1 {
	

	public static void main(String[] args) {
	 Scanner kb = new Scanner(System.in);
	 int n = kb.nextInt();
	 int []arr = new int [n];
	 for(int i =0; i < n; i++) {
		 arr[i] = kb.nextInt();
	 }
	 Arrays.sort(arr);
	 System.out.println(arr[0] * arr[n-1]);
	 kb.close();
	}
	 }