package pakjun;

import java.util.Scanner;

public class Baekjoon1037_2 {
	public static void main(String[] args) {
		 Scanner kb = new Scanner(System.in);
		 int n = kb.nextInt();
		 int []arr = new int [n];
		 for(int i =0; i < n; i++) {
			 arr[i] = kb.nextInt();
		 }
	    int tmp =0;
		for(int y =0; y < 1; y++) {
			 if(arr[y] != 1 && arr[y] != arr[y] * arr[y+1]) 
		      tmp =  arr[y] * arr[y+1];
		 }
		 System.out.println(tmp);
		 kb.close();
		}
 }
 