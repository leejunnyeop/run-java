package pakjun;




import java.util.Scanner;

public class Baekjoon1476_01 {
	

	public static void main(String[] args) {
	 Scanner kb = new Scanner(System.in);
	 int e =kb.nextInt();
	 int s =kb.nextInt();
	 int m =kb.nextInt();
	 int  year =1;
	 while(true) {
		 if(e == s && s == m) {
			 break;
		 }
		 else {
	while(true) {
		 if(e > 15) e++ ;
		 if(s > 28) s++;
		 if(m > 19) m++;
	}
	 System.out.print(year);
	 kb.close();
	}
	}
}
