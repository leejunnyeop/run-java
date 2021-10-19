package pakjun;

import java.util.Scanner;

public class Step01 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int arr[][] = new int [n][2];
		for(int i =0; i < n; i++) {
				arr[i][0] = kb.nextInt();
				arr[i][1] = kb.nextInt();
			
		}
		for(int i =0; i < n; i++) {
			int count = 1; // 한번 돌때마다 1로 초기화 해준다
			for(int y =0; y < n; y++) {
				if(i == y)  continue; // 줄이 같은면 비교(세로가 같으면 비교) 
					if(arr[i][0] < arr[y][0] && arr[i][1] < arr[y][1]) {
						// 1번째 행 비교 2번째행비교
						count ++;
						
					}
				
				
			}
		
		System.out.println(count);
		}
kb.close();
	}

}
