package step;



import java.util.Scanner;

public class Inflearn3_05_01 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = n/2+1;
		int []arr = new int [m];
		int answer=0, sum =0, p2=0;
	    for(int i = 0; i < m; i++) {
	       arr[i]=i+1;
	    	}
	    for(int p1 =0; p1 < m; p1++) {
	    	sum += arr[p1];
	    	if(sum == n)
	    		answer++;
	    	while(sum>= n) {
	    		sum -=arr[p2];
	    		if(sum == n)
	    			answer++;
	    	}
	    	
	    }
	    	System.out.println(answer);
	    	kb.close();
	    	}
	    }