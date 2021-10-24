package pakjun;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon10025_01 {
	

	public static void main(String[] args) {
	 Scanner kb = new Scanner(System.in);
	 int n = kb.nextInt();
	 int m = kb.nextInt();
	 int [][]arr = new int [2][n];
		 for(int y=0; y < n; y++)
		 arr[y][0] = kb.nextInt();
		 arr[y][1] = kb.nextInt();
	 }
	 int []answer = new int [n];
	 for(int i=0; i < n; i++) {
		 answer[i] =i+1;
	 }
	 int sum =0;
	 for(int p1=3; p1 <n; p1++) {
		 sum = arr[p1][p1]
	 }
