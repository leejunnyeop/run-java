package pakjun;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon6159_01 {
	

	public static void main(String[] args) {
	 Scanner kb = new Scanner(System.in);
	 int n = kb.nextInt();
	 int m = kb.nextInt();
	 int []arr = new int [n];
	 for(int i =0; i < n; i++) {
		 arr[i] = kb.nextInt();
	 }
	 Arrays.sort(arr);
	 int  sum=0, answer=0;
	 for(int p1=0; p1 < n; p1++) {
		 int p2 = p1+1;
	 while(p2 < n) {
		 sum = arr[p1] + arr[p2];
		 if(m >= sum)
			 answer++;
		     p2++;
		 }
	 }
	 System.out.println(answer);
	 kb.close();
	}	
}
