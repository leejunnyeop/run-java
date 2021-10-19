package step;


import java.util.Scanner;

public class Inflearn2_05 {
	public static void main(String[] args) {
    
    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();
    int answer = 2;
    for(int i =4; i < n; i++) {
    if(i % 2 != 0 && i % 3 != 0) 
    	answer ++;
    }
    System.out.println(answer);
    kb.close();
	}
}
