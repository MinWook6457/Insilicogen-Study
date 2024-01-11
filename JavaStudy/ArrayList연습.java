package JavaStudy;

import java.util.ArrayList;

public class ArrayList연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int[5];
		
		System.out.print("배열 출력 : ");
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = 5 * (i+1);
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		ArrayList<Integer> array = new ArrayList<>();
		
		array.add(5);
		array.add(10);
		array.add(15);
		
		System.out.println("리스트 출력 " + array.toString());
		System.out.print("리스트 크기 : " + array.size());
		
		
		
	}


}
