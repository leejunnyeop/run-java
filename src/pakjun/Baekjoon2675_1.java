package pakjun;

import java.util.Scanner;

public class Baekjoon2675_1 {

	public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    int a = kb.nextInt();
        int n =kb.nextInt();
	    String str = kb.next();
    for(int t =0; t < a; t++) {
    	  //int n =kb.nextInt();
    	  //  String str = kb.next();
    for(int i=0; i < str.length(); i++) {
    	for(int y=0; y < n; y++) {
    		System.out.println(str.charAt(i));
    	}
    }
    }
    kb.close();
	}
}
	