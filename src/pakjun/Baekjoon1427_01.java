package pakjun;




import java.util.Scanner;

public class Baekjoon1427_01 {
	

	public static void main(String[] args) {
	 //ArrayList<Integer> answer = new ArrayList<>();
	 Scanner kb = new Scanner(System.in);
	 String st = kb.next();
     int []arr = new int [st.length()];
     for(int i=0; i <st.length(); i++) {
    	 arr[i] = st.charAt(i) - 48;
     }
     for(int x =0; x < arr.length; x++) {
    	 for(int y=x+1; y < arr.length; y++) {
    		 if(arr[x] < arr[y]) {
    			 int tmp = arr[x];
    	         arr[x] = arr[y];
    	         arr[y] = tmp;
     }
   	 }
     }
     for(int i=0; i <st.length(); i++)
     System.out.print(arr[i]);
     kb.close();
	}
}