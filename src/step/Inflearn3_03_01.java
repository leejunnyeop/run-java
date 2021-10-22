package step;



import java.util.Scanner;

public class Inflearn3_03_01 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int []arr = new int [n];
		for(int i=0; i < n; i++) {
			arr[i] =kb.nextInt();
		}
	    int sum =0, answer =0;
	    for(int i=0; i < m; i++) {
	    	sum += arr[i];
	    	answer =sum;
	    	for(int i = m; i< n; i++) {
	    		sum += (arr[i] -arr[i-m]);
	    		answer = Math.max(answer, sum);
	    	}
	    }
	    System.out.println(answer);
	    kb.close();
	}
}
	