package step;


import java.util.Scanner;

public class Inflearn2_05_1 {
	public static void main(String[] args) {
	Scanner kb = new Scanner(System.in);
	int n =kb.nextInt();
    int []ch= new int[n+1];
    int answer =0;
    for(int i=2; i<=n; i++) {
    	if(ch[i] == 0) {
    		answer ++;
    		for(int j=i; j <=n; j=j+i) ch[j] =1;
    		}
    	}
    System.out.println(answer);
    kb.close();
    }
}
   