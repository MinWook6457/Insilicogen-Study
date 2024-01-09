package Lv2;

import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;

public class 귤고르기_미완성 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		
		int [] tangerine = new int[k];
		
		for(int i = 0 ; i < k ; i++) {
			tangerine[i] = sc.nextInt();
		}
		
		int m = sc.nextInt(); // k
		
		int mandarin = 0; // 귤 개수
		int count = 0; // 최솟값
		
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int i = 0 ; i < tangerine.length ; i++) {
			map.put(i, map.getOrDefault(i, 0) + 1); // 값이 없으면 0, 있으면 +1 하여 map에 저장
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>(map.values());
		Collections.sort(list,Collections.reverseOrder()); // 내림차순 정렬
		
		for(int i = 0 ; i < list.size() ; i++) {
			if(mandarin + i >= m) {
				count++;
			}else {
				mandarin += i;
				count++;
			}
		}
		
		System.out.println(count);
		
		
		sc.close();
	}

}
