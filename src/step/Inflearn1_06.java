package step;


import java.util.Scanner;

public class Inflearn1_06 {

	public static void main(String[] args) {
	String answer ="";
	Scanner kb = new Scanner(System.in);
	String str = kb.next();
	for(int i=0; i < str.length(); i++) {
		//System.out.println(str.charAt(i)+" "+i+" "+str.indexOf(str.charAt(i)));
	if(str.indexOf(str.charAt(i)) == i) answer+=str.charAt(i);
	
	}
	System.out.println(answer);
	kb.close();
	}
}
