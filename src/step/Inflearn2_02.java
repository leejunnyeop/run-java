package step;


import java.util.Scanner;

public class Inflearn2_02 {
	public static void main(String[] args) {
    
    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();
    int []arr = new int[n];
    for(int i=0; i < n; i++) {
    	arr[i] = kb.nextInt();
    }
    int max = arr[0], answer=0;
    for(int y=1; y < n; y++) {
    	if(max < arr[y])
    		answer ++;
    		max = arr[y];
    	   
    }
    System.out.println(answer);
    kb.close();
	}
}