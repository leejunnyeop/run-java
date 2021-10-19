package pakjun;

import java.util.Scanner;

public class Baekjoon10988_2 {

	public static void main(String[] args) {
		int yes = 1, no=0;
		String answer;
		Scanner kb = new Scanner(System.in);
		String str = kb.next(); 
		char s[] = str.toCharArray();
        int lt =0, rt =str.length() -1;
        for(int i =0; i < str.length(); i++) {
        	while(lt < rt) {
        	char tmp =s[lt];
        	s[lt] = s[rt];
        	s[rt] =tmp;
        	lt ++;
        	rt--;
        	
        }
        	answer = String.valueOf(s);
        	if(answer == str) {
        		System.out.print(yes);
        	}
        	else {
        		System.out.print(no);
        	}
        }
        kb.close();
	}
}
	
