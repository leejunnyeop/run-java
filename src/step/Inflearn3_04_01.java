package step;



import java.util.Scanner;

public class Inflearn3_04_01 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int []arr = new int [n];
		for(int i=0; i < n; i++) {
			arr[i] =kb.nextInt();
		}
	    int sum =0, answer =0, p1 =0, p2 =0;
	    while(n > p1) {
	    	sum += arr[p1];
	    	if(m == sum) {
	    		p1++;
	    		answer++;
	    	}
	    	else if (m > sum) {
	    		p1++;
	    	}
	    	else {
	    		sum -= arr[p2];
	    		p2++;
	    		p1++;
	    	}
	    	
	    }
	   
	    System.out.println(answer);
	    kb.close();
	}
}
	