package remember;

import java.util.Scanner;

public class Remember01_1 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String str[] = new String [14];
		String ch = kb.next();
		int answer = 0;
		for(int i = 0; i < 14; i++) {
			str[i] = kb.next();
			
		}
		for(int i =0; i < 14; i++)
	    if(str[i] == ch) answer++;
	    else continue;
		System.out.println(answer);
        kb.close();
	}

}
