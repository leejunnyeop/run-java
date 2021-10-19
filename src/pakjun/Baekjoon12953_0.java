package pakjun;

import java.util.Scanner;

public class Baekjoon12953_0 {

	public static void main(String[] args) {

	 Scanner kb = new Scanner(System.in);
	 int n = kb.nextInt();
	 String str[] = new String[n];
	 for(int i =0; i < n; i++) {
		 str[i] = kb.nextLine();
	 }
	 for(int i =0; i<n; i++) {
		System.out.print(str[i].toUpperCase().charAt(0));
		 for(int y=1; y < str[i].length(); y++) {
			  System.out.print(str[i].charAt(y));
		 }
		 }
	 
	 kb.close();
	}
}
	