package pakjun;

import java.util.Scanner;

public class Baekjoon18511_01 {
	public static void main(String[] args) {
		 Scanner kb = new Scanner(System.in);
		 int n = kb.nextInt();
		 int []arr = new int [n];
		 String str = kb.next();
		 int []answer = new int [str.length()];
		 int []num = new int [n];
		 for(int i =0; i < n; i++) {
			 arr[i] = kb.nextInt();
		 }
		 for(int x=0; x < str.length(); x++) {
			 answer[x] = str.charAt(x) -48;	 
		 }
		 for(int i =0; i < n; i++) {
			 if(arr[0] >= answer[i]) {
				 if(answer[i] < answer[i+1])
					 num[i] =+ answer[i+1];
				 else
					 num[i] =+ answer[i];
			 }else
				 num[i+1] =+ answer[i];
			     num[i+2] =+ answer[i];
		 }

	for(int i=0; i < n; i++)
	System.out.println(num[i]);
	kb.close();
	}
}