package step;


import java.util.Scanner;

public class Inflearn1_10 {

	public static void main(String[] args) {
     Scanner kb = new Scanner(System.in);
     String str = kb.next();
     char ch = kb.next().charAt(0);
     int answer[] = new int[str.length()];
     int p = 1000;
     for(int i=0; i < str.length(); i++) {
    	 if(str.charAt(i) == ch) {
    		 p =0;
    		 answer[i] = p;
    	 }else {
    		 p++;
    		 answer[i] =p;
    	 }
     }
     p=1000;
     for(int y=str.length()-1; y >= 0; y--) {
    	 if(str.charAt(y) == ch)
    		 p = 0;
    	 else {
    		 p ++;
    		 answer[y] = Math.min(answer[y], p);
    	 }
     }
     System.out.println(answer);
     kb.close();
     
	}
}
    		 