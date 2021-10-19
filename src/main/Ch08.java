package main;

import java.util.Scanner;

public class Ch08 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int a = kb.nextInt();
		int count = 1;
		int room = 2;
		if ( a == 1) {
			System.out.println(1);
		}else {
			while(room <= a) { // 방의 개수가 들어오는 수보다 작으면 반복 해줘
				room =+ room + (count * 6); // 방 + 간격 * 방의 크기
				count ++;
			}
			System.out.println(count);
		}
		kb.close();
	}
}


