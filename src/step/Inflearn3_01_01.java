package step;

import java.util.ArrayList;
import java.util.Scanner;

public class Inflearn3_01_01 {

	public static void main(String[] args) {
		ArrayList<Integer> answer = new ArrayList<>();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int []a = new int [n];
		for(int i =0; i < n; i++) {
			a[i] = kb.nextInt();
		}
		int m = kb.nextInt();
		int []b = new int [m];
        for(int y=0; y < m; y++) {
        	b[y] = kb.nextInt();
        }
        int p1=0, p2=0;
        while(p1 < n && p2 <m) {
        	if(a[p1] < b[p2]) {
        		answer.add(a[p1]);
        	    p1++;
        }else
        	answer.add(b[p2]);
        	p2++;
        }
	
	 while(p1 < n) answer.add(a[p1++]);
	 while(p2 < m) answer.add(b[p2]++);

      System.out.print(answer);
      kb.close();
}
}