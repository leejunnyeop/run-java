package step;


import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Inflearn4_1_1 {

	public static void main(String[] args) {
		HashMap<Character, Integer> map = new HashMap<>();
		char answer =' ';
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String st = kb.next();
		for(char x: st.toCharArray()) {
            map.put(x, map.getOrDefault(x,0)+1);			
		}
		int max =Integer.MAX_VALUE;
		for(char key: map.keySet())
		//System.out.println(key+" "+map.get(key));
			if(map.get(key) > max) {
				max = map.get(key);
				answer = key;
			}
		System.out.println(answer);
		kb.close();
				}
			}
		
		
	

