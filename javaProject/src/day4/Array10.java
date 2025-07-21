package day4;

import java.util.Arrays;

public class Array10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 배열의 있는 수를 모두 절대값(음수 -> 양수)으로 바꾸시오.
		int arr[] = { 3, 5, -15, 10, -8 };
		
		for (int i = 0; i < arr.length; i++) {
			
			//1.
//			if(arr[i]<0) {
//				arr[i] = -arr[i];
//			};
			
			//2.
//			arr[i] = ((arr[i] >= 0) ? arr[i] : -arr[i]);
			
			//3.
			arr[i] = Math.abs(arr[i]);
		}
		System.out.println(Arrays.toString(arr));
		
		System.out.println(Math.min(3, 5));

	}

}
