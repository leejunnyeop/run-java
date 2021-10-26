package pakjun;


import java.util.Scanner;

public class Baekjoon10025_01 {
	

	public static void main(String[] args) {
	 Scanner kb = new Scanner(System.in);
	 int n = kb.nextInt();
	 int m = kb.nextInt();
	 int [][]a = new int [n][2];
	 for(int i=0; i < n; i++) {
		 a[i][0] = kb.nextInt();
		 a[i][1] = kb.nextInt();
	 }	
	 int []arr = new int [15];
	 for(int i=0; i < n; i++) {
		 arr[i] = i+1;
	 }
	 int p2 = m, answer =0;
	 for(int p1 =0; p1 < arr.length; p1++) {
		 if(arr[p1] == a[p1][0] && p1 >= m) {
			 answer += a[p1][1]+a[p1+p2][p1-p2] ;
		 }
		 else if(arr[p1] == a[p1][0] && p1 < m) {
			 answer += a[p1][1];
		 }
	 }
	 System.out.println
	 kb.close();
	}
}
	 
	 
		