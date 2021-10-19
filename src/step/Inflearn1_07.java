package step;


import java.util.Scanner;

public class Inflearn1_07 {

	public static void main(String[] args) {
	String answer ="YES";
	Scanner kb = new Scanner(System.in);
	String str = kb.next();
    str = str.toUpperCase();
    int len = str.length();
    for(int i =0; i < len/2; i++) {
    	if(str.charAt(i) != str.charAt(len - i -1)) return "NO";
    	
    }
    
