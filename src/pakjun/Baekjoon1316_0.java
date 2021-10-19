package pakjun;

import java.util.Scanner;

public class Baekjoon1316_0 {

	public static void main(String[] args) {
	   Scanner kb = new Scanner(System.in);
	   String answer = "";
	 //  int m =0;
	   int n = kb.nextInt();
	   
	   for(int y=0; y < n; y++) {
		   String str = kb.next();
	   for(int i=0; i < str.length(); i++) {
		   if(str.indexOf(str.charAt(i)) == i)  answer += str.charAt(i);
		//   if(str.equals(answer)) m++;
	   }
	   }
	   System.out.println(answer);
	   kb.close();
	}
}