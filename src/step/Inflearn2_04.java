package step;


import java.util.Scanner;

public class Inflearn2_04 {
	public static void main(String[] args) {
   // ArrayList<Integer> answer = new ArrayList<>();
    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();
    int []answer = new int[n];
    answer [0] =1;
    answer [1] =1;
    for(int i=2; i < n; i++) {
    	answer[i] = answer[i-2]+answer[i-1];
    	//System.out.println(answer);
    }
    for(int i=0; i<n; i++)
    System.out.print(answer[i]+" ");
    kb.close();
}

}

