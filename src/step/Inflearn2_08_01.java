package step;


import java.util.Scanner;

public class Inflearn2_08_01 {
	public static void main(String[] args) {
    int min =1;
	Scanner kb = new Scanner(System.in);
	int n = kb.nextInt();
	int []answer = new int[n];
	int arr[] = new int[n];
	for(int i=0; i < n; i++) {
		arr[i] = kb.nextInt();
	}
	for(int i =0; i < n; i++) {
	      min =1;
		for(int x=1; x <n; x++) {
			if(arr[i] < arr[x])
				min ++;
		}
		answer [i]= min;
	}
	for(int i=0; i <n; i++) {
	System.out.print(answer[i]+" ");
	}
	kb.close();
	}
}
