package step;


import java.util.Scanner;

public class Inflearn1_11 {

	public static void main(String[] args) {
	 String answer ="";
	 int n =0;
     Scanner kb = new Scanner(System.in);
     String str = kb.next();
     for(int i =0; i < str.length(); i++) {
    	 if(str.indexOf(str.charAt(i)) == i) 
    		 answer+=str.charAt(i);
    	 if(str.indexOf(str.charAt(i)) == str.charAt(i+1));
    		 n++;
    	 
    	
     }
     System.out.println(answer+n);
     kb.close();
	}
}

    		 