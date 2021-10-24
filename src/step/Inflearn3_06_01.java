package step;


import java.util.Scanner;

public class Inflearn3_06_01 {

	public static void main(String[] args) {
	Scanner kb = new Scanner(System.in);
	int n = kb.nextInt();
	int m= kb.nextInt();
	int []arr = new int [n];
	for(int i=0; i < n; i++) {
		arr[i] = kb.nextInt();
	}
	int p2 =0, answer=0, cnt=0;
	for(int p1 =0; p1 < n; p1++) {
		if(arr[p1] == 0)
			cnt++;
		while(cnt > m) {
			if(arr[p2] == 0)
				cnt--;
			    p2++;
		}
		answer = Math.max(answer, p1-p2+1);
	}
	System.out.println(answer);
	kb.close();
	}
}