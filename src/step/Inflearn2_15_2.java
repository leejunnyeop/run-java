package step;

import java.util.Scanner;

public class Inflearn2_15_2 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int answer =0, cnt=1;
		n--;
		while(n > 0) {
			cnt++;
			n= n -cnt;
			if(n % cnt == 0) answer++;
			
		}
		System.out.println(answer);
		kb.close();
		

	}

}
