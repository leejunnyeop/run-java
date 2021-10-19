package step;


import java.util.Scanner;

public class Inflearn1_12 {

	public static void main(String[] args) {
	 String answer="";
     Scanner kb = new Scanner(System.in);
     int n  = kb.nextInt();
     String str = kb.next();
     for(int i =0; i < n; i++) {
    	 String tmp= str.substring(0, 7).replace('#', '1').replace('*','0');
    	 int num = Integer.parseInt(tmp, 2);
    	 answer+=(char)num;
    	 str=str.substring(7);
     }
     System.out.println(answer);
     kb.close();
	}
}