package Lv2;

import java.util.Scanner;
import java.util.Stack;

// https://school.programmers.co.kr/learn/courses/30/lessons/12909

public class 올바른괄호 {
	
	static boolean check(String str) {
		Stack<Character> stackStr = new Stack<>(); // 스택 객체 선언
		char ch,open_ch;
		
		for(int i = 0 ; i < str.length() ; i++) {
			ch = str.charAt(i);
			
			switch(ch) {
			case '(' : case '[' : case '{' : // 열린 괄호라면 스택에 추가
				stackStr.push(ch);
				break;
			case ')':  case ']': case '}': // 닫은 괄호가 나오면 열린 괄호와 검사
				if(stackStr.isEmpty()) { // 스택이 비었다면 오류
					return false;
				}else {
					open_ch = stackStr.pop();
					if (ch != '(' && open_ch == ')' || ch != '[' && open_ch == ']' || ch != '{' && open_ch == '}') // 괄호가 쌍을 이루지 않는다면
						return false;
				}
				break;
			}
			
		}
		if(!stackStr.isEmpty()) {
			return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		String str = sc.nextLine();
		
		if(check(str) == true) {
			System.out.println("올바른 괄호 입니다.");
		}else {
			System.out.println("올바르지 않은 괄호 입니다.");
		}
		
		
		sc.close();
	}
}
