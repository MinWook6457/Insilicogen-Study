package Lv2;

import java.util.Arrays;
import java.util.Comparator;

// https://school.programmers.co.kr/learn/courses/30/lessons/42746

/* 
 * 참고 
 * https://codechacha.com/ko/java-sorting-comparable/
 * https://codechacha.com/ko/java-sorting-array/
 * https://mine-it-record.tistory.com/133
*/
import java.util.Scanner;

public class 가장큰수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int [] numbers = null;
		
		String result = "";
		
		boolean zero = true; // 0이 첫 자리에 오는 경우 및 변수가 000~ 인 경우 방지
		
		System.out.println("입력 할 배열 개수 : ");
		int x = sc.nextInt();
		
		numbers = new int[x];
		
		String [] parsingNumber = new String[x];
		
		for(int i = 0 ; i < x ; i++) {
			numbers[i] = sc.nextInt();
		}
		
		
		for(int i = 0 ; i < x ; i++) {
			parsingNumber[i] = String.valueOf(numbers[i]);
			if(numbers[i] != 0)
				zero = false;
		}
		
		// 두 문자열을 조합하였을 때 (앞 + 뒤) , (뒤 + 앞)에서 먼저 오는 경우를 앞으로 보내야함
		
		Arrays.sort(parsingNumber, new Comparator<String>(){ // java.util.Comparator<String>
			@Override
			public int compare(String x,String y) { // sort내 compare 메소드 오버라이딩
				return (y+x).compareTo(x+y); // 문자열 비교, 비교하여 앞+뒤 의 위치 반환 => 내림 차순
			}
		});
		
		for(int i = 0 ; i < parsingNumber.length ; i++) {
			result += parsingNumber[i];
			if(zero) {
				result = "0";
			}
		}
		
		System.out.println(result);
		
		sc.close();
	}

}
