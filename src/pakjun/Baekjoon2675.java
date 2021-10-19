package pakjun;

import java.util.Scanner;

public class Baekjoon2675 {

	public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();
    String str = kb.next();
    for(int i=0; i < str.length(); i++) {
      int answer = str.charAt(i) * n;
    }
	System.out.println(answer);
    kb.close();
	}
}