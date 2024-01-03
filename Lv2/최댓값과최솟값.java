package Lv2;

import java.util.Scanner;

// 공백으로 입력
// https://school.programmers.co.kr/learn/courses/30/lessons/12939
public class 최댓값과최솟값 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
				
		System.out.println(str);
		
		String [] test = str.split(" "); // split 함수 사용하여 공백 기준으로 test 배열에 저장
		
		// 첫 번째 요소로 초기화
		int max , min , r;
		max = min = Integer.parseInt(test[0]); 
		
		for(int i = 1 ; i < test.length ; i++) { // 첫 번째 요소부터 반복
			r = Integer.parseInt(test[i]); // 공백을 기준으로 자른 각 요소 저장
			
			if(max < r)
				max = r;
			if(min > r)
				min = r;
		}
		
		System.out.println(min + " " + max); // 형식에 맞게 출력
		
		sc.close(); // 스캐너 닫기
	}

}
