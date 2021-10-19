package step;

import java.util.ArrayList;
import java.util.Scanner;

public class Inflearn2_01 {
	public static void main(String[] args) {
	Scanner kb = new Scanner(System.in);
	  ArrayList<Integer> answer = new ArrayList<>();
	 
    int n = kb.nextInt();
    int []m = new int [n];
    for(int i =1; i < n; i++) {
    	m[i] = kb.nextInt();
    }
    
    for(int y=1; y < n; n++) {
    	if(m[y] > m[y-1])
    	answer.add(m[y]);
    }
    answer.add(m[0]);
	System.out.println(answer);
	kb.close();
}

	
}