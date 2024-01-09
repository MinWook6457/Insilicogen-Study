package Lv2;

import java.util.*;

public class 의상 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		String [][] clothes = {
				{"yellow_hat","headgear"},
				{"blue_sunglasses","eyewear"},
				{"green_turban","headgear"},
		};
		
		int answer = 1;
		HashMap<String,Integer> map = new HashMap<>();
		
		for(int i = 0 ; i < clothes.length ; i++) {
			String type = clothes[i][1]; 
			map.put(type, map.getOrDefault(type, 1) + 1 ); // 있다면 value + 1 , 없다면 1
		}
		
		for(String key : map.keySet()) {
			answer += map.get(key);
		}
		
		System.out.println(answer - 1);	// 하루 최소 한 개 이상의 옷을 입으므로 전체-1	
		
		sc.close();
	}

}
