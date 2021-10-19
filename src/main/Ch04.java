package main;

import java.util.Scanner;

public class Ch04 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int Alpha[] = new int [26];
		int max = 0, cnt =0, numb = 0;
		String num = kb.next().toUpperCase();
		for(int i =0; i < num.length(); i++) {
			Alpha[(num.charAt(i)- 65)] ++;
			}
	    for(int y = 0; y < Alpha.length; y++) {
	    	if(Alpha [y] > max) {
	    		max = Alpha[y];
	    		numb = y;
	    	}
	    }
	    for(int z =0; z < Alpha.length; z++) {
	    	if(Alpha [z] == max) {
	    	   cnt ++;
	    	}
	    }
	    if(cnt > 1) {
	    	System.out.println("?");
	    }else {
	    	System.out.println((char)(numb+65));
	    }
	    kb.close();
	}
}