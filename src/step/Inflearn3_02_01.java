package step;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Inflearn3_02_01 {

	public static void main(String[] args) {
		ArrayList<Integer> answer = new ArrayList<>();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int a[] = new int [n];
		for(int i =0; i < n; i++) {
			a[i] = kb.nextInt();
		}
		int m = kb.nextInt();
		int []b = new int [m];
		for(int i =0; i < m; i++) {
			b[i] = kb.nextInt();
		}
		Arrays.sort(a);
		Arrays.sort(b);
		for(int p1 =0; p1 < n; p1++) {
			for(int p2 =0; p2 < m; p2++) {
			if(a[p1] == b[p2])
				answer.add(a[p1]); 
		}
		}
		System.out.println(answer);
		kb.close();
	}
}