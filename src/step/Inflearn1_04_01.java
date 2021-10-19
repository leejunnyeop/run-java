package step;

import java.util.ArrayList;
import java.util.Scanner;

public class Inflearn1_04_01 {

	public static void main(String[] args) {
		ArrayList<String> answer = new ArrayList<>();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String str[] = new String[n];
		for(int i =0; i < n; i++) {
			str[i] = kb.next();
		}
		for(String x : str) {
			char s[] = x.toCharArray();
		    int lt = 0, rt =x.length()-1;
		    while(lt < rt) {
		    	char tmp=s[lt];
		    	s[lt] = s[rt];
		    	s[rt]=tmp;
		    	lt++;
		    	rt++;
		    }
		    String tmp=String.valueOf(s);
		    answer.add(tmp);
		}
        System.out.println(answer);
        kb.close();
	}

}
