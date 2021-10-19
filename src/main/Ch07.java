package main;

import java.util.Scanner;

public class Ch07 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int a = kb.nextInt();
		int b = kb.nextInt();
		
		a =Integer.parseInt(new StringBuilder().append(a).reverse().toString());
		b =Integer.parseInt(new StringBuilder().append(b).reverse().toString());
		
		if(a > b) {
			System.out.println(a);
		}else {
			System.out.println(b);
		}
		kb.close();
	}
}



	