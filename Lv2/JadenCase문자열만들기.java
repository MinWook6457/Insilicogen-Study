package Lv2;

import java.util.Scanner;
import java.util.StringTokenizer;

// 3people unFollowed me
// https://school.programmers.co.kr/learn/courses/30/lessons/12951
public class JadenCase문자열만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		str = str.toLowerCase(); // 전부 소문자로 바꾸기
		
		System.out.println(str);
		
		StringTokenizer st = new StringTokenizer(str, " ", true);
		
		StringBuilder sb = new StringBuilder(); // 문자열을 연결해야 하므로 변경 가능한 문자열을 만드는 StringBuilder 선언
		
		while (st.hasMoreTokens()) {
			String nextWord = st.nextToken();
			if(nextWord.equals(" ")) { // 공백이면 그대로 출력
				sb.append(nextWord);
			}else {
				sb.append(nextWord.substring(0, 1).toUpperCase() + nextWord.substring(1)); // 첫 번째 요소 대문자로 바꾸고 나머지 이어 붙이기
			}
			
		
		}
		sb.toString(); // 반드시 필요
		System.out.println(sb);
	}
}
