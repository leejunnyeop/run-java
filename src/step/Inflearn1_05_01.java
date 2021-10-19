package step;


import java.util.Scanner;

public class Inflearn1_05_01 {

	public static void main(String[] args) {
		String answer;
		Scanner kb = new Scanner(System.in);
	    String str =kb.next();
	    char s[] = str.toCharArray();
	    int lt =0, rt=str.length()-1;
	    while(lt < rt) {
	    	if(!Character.isAlphabetic(s[lt])) lt++; // ¾ËÆÄºªÀÌ ¾Æ´Ò‹š Âü lt Áõ°¡
	    else if(!Character.isAlphabetic(s[rt])) rt--;
	    else {
	    	char tmp=s[lt];
	    	s[lt]=s[rt];
	    	s[rt]=tmp;
	    	lt++;
	    	rt--;
	    }
	}
	    answer =String.valueOf(s);
	    System.out.println(answer);
	    kb.close();
	}
}
