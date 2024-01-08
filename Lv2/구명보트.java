package Lv2;

// https://school.programmers.co.kr/learn/courses/30/lessons/42885

import java.util.Scanner;
import java.util.Arrays;

public class 구명보트 {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt(); // 배열 크기 입력
		int limit = sc.nextInt(); // 리미트 입력
		int [] arr = new int[n];
		
		for(int i = 0 ; i < arr.length; i++) { // 배열 원소 입력
			arr[i] = sc.nextInt();	 
		}
		
		Arrays.sort(arr);
		
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
		
		int min = 0;
		int count = 0;
		/*
		for(int i = 0 ; i < n ; i++) {
			if(arr[max] + arr[min] <= limit) {
				min++;
				count++;
			}else {
				max--;
			}
		}
		*/
		
		// 50 50 70 80 <min + max <= limit> 
		
		for(int max = arr.length-1 ; min <= max ; max--) {
			if(arr[min] + arr[max] <= limit) {
				min++;
			}
			count++;
		}
		
		
		System.out.println(count);
		
		sc.close();
	}

}
