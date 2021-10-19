package step;

import java.util.Scanner;

public class Inflearn2_10 {


	public static void main(String[] args) {
		int dx[] = {-1, 0, 1, 0};
		int dy[] = {0, 1, 0, -1};
		int answer = 0;
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int arr[][] = new int [n][n];
		for(int i =0; i < n; i++) {
			for(int j=0; j < n; j++) {
				arr[i][j] = kb.nextInt();
			 }	
			}
			for(int i =0; i < n; i++) {
				for(int j=0; j < n; j++) {
					boolean flag = true; // 봉우리가 맞으면 true
					for(int k=0; k< 4; k++) {
						int nx = i+dx[k];
						int ny = j+dy[k];
						if( nx>=0 && nx < n && ny>=0 && ny < n && arr[nx][ny] >= arr[i][j] ) {
							// 
							flag=false;
							break;
						}
						
					}
					if(flag) answer ++; // 참이면 answer ++ 
				}
		}
			System.out.print(answer);
			kb.close();

	}

}
