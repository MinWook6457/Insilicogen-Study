package Lv2;

// https://school.programmers.co.kr/learn/courses/30/lessons/12949

import java.util.Scanner;

public class 행렬의곱셈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		
		int b1 = sc.nextInt();
		int b2 = sc.nextInt();
		
		int [][] a = new int[a1][a2];
		
		int [][] b = new int[b1][b2];
		
		for(int i = 0 ; i < a1 ; i++) {
			for(int j = 0 ; j < a2 ; j++) {
				a[i][j] = sc.nextInt();
			}
		}
	
		
		for(int i = 0 ; i < b1 ; i++) {
			for(int j = 0 ; j < b2 ; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		
		int [][] result = new int[a.length][b[0].length];		
		
		for(int i = 0 ; i < a.length ; i++) {
			for(int j = 0 ; j < b[0].length ; j++) {
				int temp = 0;
				for(int k = 0 ; k < b.length ; k++) {
					temp += a[i][k] * b[k][j];
				}
				result[i][j] = temp;
			}
		}
		
		for(int i = 0 ; i < a.length ; i++) {
			for(int j = 0 ; j < b[0].length ; j++) {
				System.out.print(result[i][j] + " ");		
			}
		}
		
		sc.close();
	}

}
