package step;


import java.util.Scanner;

public class Inflearn2_06 {
	public static void main(String[] args) {
    ArrayList<Integer> answer = new ArrayList<>();
    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();
    int []arr = new int [n];
    for(int i =0; i < n; i++) {
    	arr[i] = kb.nextInt();
    }
    for(int x =0; x < n; x++) {
    	int tmp = arr[x];
    	int res = 0;
    	while(tmp > 0) {
    		int t = tmp % 10;
    		res = res * 10 + t;
    		tmp = tmp /10;
    		
    	}
    	boolean isPrime = new int 
    	if(isPrime(res)) answer.add(res);
    }

