package Lv2;

// https://school.programmers.co.kr/learn/courses/30/lessons/12911

import java.util.Scanner;

public class 다음큰숫자 {
	
	public static int change_Binary(int n) { // 이진수 변환 시 1의 개수를 구하는 함수
		int one = 1;
		
		while(n > 1) {
			if(n%2==1)
				one++; // 1의 개수 증가
			
			n /= 2; // 2로 계속 나누어줌
		}
		return one;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int result = 0;
				
		int currentOne = change_Binary(n);	
		
		while(true) {
			n++; // 입력된 값 증가
			int nextOne = change_Binary(n); // 증가된 값에서의 이진수 변환 시 1의 개수 저장
			
			if(currentOne == nextOne) // 두 값의 이진수 변환 시 1의 개수가 같으면 멈춤
				break;
			
		}
		result = n; // 증가된 값 저장
		System.out.println(result);
		
		sc.close();
	}

}
