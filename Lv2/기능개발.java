package Lv2;

// https://school.programmers.co.kr/learn/courses/30/lessons/42586

import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class 기능개발 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int [] progresses = new int[n];
		int [] speeds = new int[n];
				
		for(int i = 0 ; i < n ; i++) {
			progresses[i] = sc.nextInt();
		}
		
		for(int i = 0 ; i < n ; i++) {
			speeds[i] = sc.nextInt();
		}
		
		ArrayList<Integer> result = new ArrayList<Integer>(); // 결과 반환 리스트
		Queue<Integer> queue = new LinkedList<Integer>(); // 큐를 통해 프로세싱 확인
		
		/*
		 큐 라이브러리 연산
		 add : 삽입
		 peek : 가장 최근 데이터 확인
		 remove() : 제거 => 비어있을 시 Error
		 poll() : 제거 => 비어있을 시 null
		 isEmpty() : 비어있는지 확인		 
		*/
		
		// 작업이 100일 넘기위한 최소 일수 계산 후 큐에 삽입
		// (100 - 작업일수 / 작업속도)로 나온 값이 @.xxx이면 이를 올림하여 작업 최소 일수 계산 
		// 100 - 작업일수 / 작업속도 가 int형으로 나와 나눈 몫의 값으로만 데이터 삽입됐음
		// 해결하기 위해 100을 100.0으로 변환
		for(int i = 0 ; i < progresses.length ; i++) {
			queue.add((int)(Math.ceil((100.0-progresses[i])/speeds[i]))); 
		}
		
		System.out.println(queue);
		
		// [Test1 Case] => [7,3,9] 로 출력
		
		// 큐에서 최근에 뽑은 요소가 뒤에 요소보다 크다면 같은 일자에 배포
		// 배포는 하루의 끝에 이루어짐
		while(!queue.isEmpty()) {
			int workDay = queue.poll();
			int count = 1;
			
			while(!queue.isEmpty() && queue.peek() <= workDay) {
				count++;
				queue.poll();
			}
			
			result.add(count);
		}
		
		System.out.println(result.toString());
		
		
		sc.close();
	}

}
