package step;

import java.util.Scanner;

public class Inflearn1_08 {
	public static void main(String[] args) {
	String answer = "NO";
	Scanner kb = new Scanner(System.in);
    String str = kb.nextLine();
    str = str.toUpperCase().replaceAll("[^A-Z]", "");
    String tmp = new StringBuilder(str).reverse().toString();
    if(str.equals(tmp)) System.out.println("YES");
    return answer;
	}
	kb.close
}
    	
    
