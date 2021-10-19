package pakjun;

import java.util.Scanner;

public class Baekjoon10988_1 {

	public static void main(String[] args) {
		int yes = 1, no=0;
		String answer="";
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		for(int i =str.length() -1; i >= 0; i--) {
			answer += str.charAt(i);
		}
		if(answer.equals(str)) {
			System.out.println(yes);
		}else
			System.out.println(no);
		kb.close();
	}
}
		
		

	
