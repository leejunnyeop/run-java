package pakjun;

import java.util.Scanner;

public class Baekjoon10988_0 {

	public static void main(String[] args) {
		int yes = 1, no=0;
		Scanner kb = new Scanner(System.in);
		String str = kb.next(); 
		String tmp = new StringBuilder(str).reverse().toString();
		if(str == tmp) {
			System.out.println(yes);
	}else
		System.out.println(no);
		
kb.close();
}
	
}
