package main;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ch05 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
	    String s = kb.nextLine();
	    StringTokenizer st = new StringTokenizer(s," ");
	    System.out.println(st.countTokens());
	    kb.close();
	}
}
			

	