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
			while(room <= a) { // ���� ������ ������ ������ ������ �ݺ� ����
				room =+ room + (count * 6); // �� + ���� * ���� ũ��
				count ++;
			}
			System.out.println(count);
		}
		kb.close();
	}
}


