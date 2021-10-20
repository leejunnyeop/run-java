package pakjun;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon23056_01 {
	

	public static void main(String[] args) {
	 Scanner kb = new Scanner(System.in);
	 int n = kb.nextInt();
	 String st = kb.next(); // 스페이스바 기준
	 for(char x : st.toCharArray()) {
		 System.out.println(x);
	 }
	 kb.close();
	}
}