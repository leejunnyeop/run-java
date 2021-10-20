package pakjun;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon2693_1 {
	public static void main(String[] args) {
		 Scanner kb = new Scanner(System.in);
		 int n = kb.nextInt();
		 int []arr = new int [10];
		 int []answer = new int [n];
		 for(int i =0; i < n; i++) {
			 for(int y=0; y < 10; y++) {
			 arr[y] = kb.nextInt();
		 }
		 Arrays.sort(arr);
	     answer[i] =arr[7];
		 }
		 for(int x=0; x < n; x++)
		 System.out.print(answer[x]+" ");
	     kb.close();
 }
}
 