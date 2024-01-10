package Lv2;

import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;

public class 귤고르기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int [] tangerine = new int[n];
		
		for(int i = 0 ; i < n ; i++) {
			tangerine[i] = sc.nextInt();
		}
		
		int k = sc.nextInt(); // k
		
	    int sum = 0; // 고를 귤의 개수
	    int cnt = 0; // 최솟값 카운트
	        
	    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	    
	    for(int num : tangerine) {
	    	map.put(num, map.getOrDefault(num, 0) + 1);
	    	}
 	    ArrayList<Integer> valueList = new ArrayList<>(map.values()); 
	    Collections.sort(valueList, Collections.reverseOrder()); // 내림 차순
	    for (int v : valueList) {
	    	if (sum + v >= k) {
	    		cnt++;
	    		break;
	    		} else {
	    			sum += v;
	                cnt++;
	            }
	    	}
		
		System.out.println(cnt);
		
		
		sc.close();
	}

}
