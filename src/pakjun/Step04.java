package pakjun;

import java.util.Scanner;

public class Step04 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
	    int n = kb.nextInt();
	    int answer =0, sum =0, lt = 0;
	    int arr[] = new int [40];
	    for(int i =2; i < n; i++) 
	    	arr[i] = i;
	    for(int rt =2; rt < n; rt++) {
	    	sum += arr[rt];
	    	if( n == sum && rt % 2 == 1) 
	    		answer ++;
	    	while(sum >= n) {
	    		sum -= arr[lt++];
	    		if(n == sum && rt % 2 ==1)
	    			answer ++;
	    	}
	    }
	    System.out.println(answer);
	    kb.close();
	}
}