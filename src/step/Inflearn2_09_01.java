package step;

import java.util.Scanner;

public class Inflearn2_09_01 {
	public static void main(String[] args) {
	Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();
    int [][]arr = new int [n][n];
    for(int x=0; x <n; x++) {
    	for(int y=0; y < n; y++) {
    		arr[x][y] = kb.nextInt();
    	}
    }
    for(int i =0; i < n; i++) {
    	for(int j=0; j <n; j++) {
    		if(arr[i][j] == arr[j][i])
    			arr[i][j] 
    	}
    }