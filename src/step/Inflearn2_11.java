package step;

import java.util.Scanner;

public class Inflearn2_11 {


	public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int answer =0, max = Integer.MIN_VALUE;
        int n = kb.nextInt();
        int arr[][] = new int [n+1][6];
        for(int i =1; i <= n; i++) {
        	for(int y =1; y <= n; y++) {
        		arr[i][y] = kb.nextInt();
        	}
        }
        for(int i =1; i < n; i++) {
        	int cnt =0;
        	for(int j =1; j <= n; j++) {
        		for(int k=1; k <= 5; k++) {
        			if(arr[i][k] == arr[j][k]) {
        				cnt ++;
        				break;
        			}
        		}
        	}
        
        if(cnt> max) {
        	max=cnt;
        	answer=i;
        }
        System.out.println(answer);
}
        kb.close();
	}
}