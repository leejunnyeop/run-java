package step;


import java.util.Scanner;

public class Inflearn1_11_1 {

	public static void main(String[] args) {
	 String answer ="";
     Scanner kb = new Scanner(System.in);
     String str = kb.next();
        str = str + "";
    	 int cnt = 1;
    	 for(int y=1; y < str.length(); y++)
    	 if(str.charAt(y) == str.charAt(y+1))
    	     cnt++;
    	 else {
    		 answer += str.charAt(y);
    		 if(cnt > 1) answer += String.valueOf(cnt);
    		 cnt=1;
     }
    
	//System.out.println(cnt);
	System.out.println(answer);
     kb.close();
	}
}

    		 