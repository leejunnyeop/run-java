package step;


import java.util.Scanner;
import java.util.StringTokenizer;

public class Inflearn3_6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		//int n = kb.nextInt();
		//int m = kb.nextInt();
	    String s = kb.nextLine();
	    StringTokenizer st = new  StringTokenizer(s);
	    System.out.println(st.countTokens());
	    kb.close();
	}

}
