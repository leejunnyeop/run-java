package step;


import java.util.Scanner;

public class Inflearn2_03 {
	public static void main(String[] args) {
		
    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();
    int [][] arr = new int [2][n];
    for(int i=0; i < n; i++) {
    	arr[0][i] = kb.nextInt();
    	arr[1][i] = kb.nextInt();
    }
    for(int x=0; x < n; x++) {
    	if(arr[0][x] == arr[1][x]) 
    		System.out.println("D");
    	else if(arr[0][x] == 1 && arr[1][x] == 3)
    		System.out.println("A");
    	else if(arr[0][x] == 2 && arr[1][x] == 1)
    		System.out.println("A");
    	else if(arr[0][x] == 3 && arr[1][x] == 2)
             System.out.println("A");
    	else
    		System.out.println("B");
    	}
    		kb.close();
    }
}