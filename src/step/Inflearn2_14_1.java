package step;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Inflearn2_14_1 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		ArrayList<Integer> answer = new ArrayList<>();
		int n = kb.nextInt();
		int a[] = new int [n];
		for(int i =0; i < n; i++) {
			a[i] = kb.nextInt();
			Arrays.sort(a);
		}
		int m = kb.nextInt();
		int []b = new int [m];
		for(int y =0; y < n; y++ ) {
			b[y] = kb.nextInt();
			Arrays.sort(b);
		}
		int p1 =0, p2 =0;
		while(p1 < n && p2 < m) {
			if(a[p1] == b[p2] ) {
				answer.add(a[p1++]);
				p2++;
				}
			else if(a[p1] < b[p2]) p1++; //작을 쪽을 증가 시켜 준다
			else p2 ++;
			}
	
kb.close();
	
	}
}
