package Lv2;

import java.util.Arrays;
import java.util.Scanner;

// https://school.programmers.co.kr/learn/courses/30/lessons/12941

public class 최솟값만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		int [] array_a = new int[x];
		int [] array_b = new int[x];
		
		for(int i = 0 ; i < x ; i++) {
			array_a[i] = sc.nextInt();
		}
		
		for(int i = 0 ; i < x ; i++) {
			array_b[i] = sc.nextInt();
		}
		
		// 오름 차순 정렬
		
		Arrays.sort(array_a); 
		Arrays.sort(array_b);
		
		int result = 0;
		
		for(int i = 0 ; i < x ; i++) {
			result += (array_a[i] * array_b[x-1-i]);
		}
		
		System.out.println(result);
		
		sc.close();
	}

}
