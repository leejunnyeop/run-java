package pakjun;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon10825_01 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String [][] arr = new String [n][4];
		for(int i =0; i < n; i++) {
			arr[i][0] = kb.next();
			arr[i][1] = kb.next();
			arr[i][2] = kb.next();
			arr[i][3] = kb.next();
		}
		Arrays.sort(arr);
	    for(int i =0; i < n; i++) {
	    	System.out.println(arr[i][0]);
	    	System.out.println(arr[i][1]);
	    	System.out.println(arr[i][2]);
	    	System.out.println(arr[i][3]);
		}
kb.close();
	}

}
