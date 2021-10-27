package step;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Inflearn4_3_1 {

	public static void main(String[] args) {
	ArrayList<Integer> answer = new ArrayList<>();
	Scanner kb = new Scanner(System.in);
	int n = kb.nextInt();
	int m = kb.nextInt();
	int []arr = new int [n];
	for(int i=0; i < n; i++) {
		arr[i] = kb.nextInt();
	}
	HashMap<Integer, Integer> map = new HashMap<>();
    for(int i=0; i < m-1; i++) {
    	map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
    }
    int p2 =0;
    for(int p1 =m-1; p1 < n; p1++) {
        map.put(arr[p1], map.getOrDefault(arr[p1], 0)+1);
        answer.add(map.size());
        map.put(arr[p2], map.get(arr[p2])-1);
        if(map.get(arr[p2])==0) map.remove(arr[p2]);
        p2++;
        }
    System.out.println(answer);
    kb.close();
    }
	}


