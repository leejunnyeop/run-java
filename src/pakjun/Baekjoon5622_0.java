package pakjun;

import java.util.Scanner;

public class Baekjoon5622_0 {

	public static void main(String[] args) {
		int answer = 0;
	   Scanner kb = new Scanner(System.in);
	   String str =kb.next();
	   char ch[] =str.toCharArray();
	   for(int i=0; i < ch.length; i++) {
		   int ap = ch[i] -65;
		   if(ap == 18 || ap == 21 || ap == 24 || ap == 25) answer += (ap / 3) +2;
		   else answer += (ap/3) + 3;
	   }
		  System.out.println(answer); 
		  kb.close();
	   }
}