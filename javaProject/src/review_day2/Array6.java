package review_day2;

import java.util.Arrays;
import java.util.Random;

public class Array6 {
	
	public static void main(String[] args) {
	
		int arr[] = ArrayFunc.randomArr(10, 1, 30);
		System.out.println(Arrays.toString(arr));
		//오름차순 => Arrays.sort(arr)
		//내림차순 => ArrayFunc.descSort(arr);
		ArrayFunc.descSort(arr);
	
		System.out.println(Arrays.toString(arr));
		
		//{
		// {1,2},
		// {3,4},
		// {5,6},
		//}
		//new int[3][2]
		int arr2[][] = {
				{10,5},
				{3,7},
				{2,9}
			};
		//arr2[0] => {10,5}
		//arr2[1] => {3,7}
		//arr2[2][1] => 9
		arr2[1][0] = 30;
		arr2[1][1] = 50;
		
//		int arr3[] = {100,200};
		
//		arr2[0] => {10,5};
//		arr2[1] => {3,7};
//		arr2[2][1] =>9
		
//		arr2의 모든 값의 합
		System.out.println(arr2.length);
		
		int sum = 0;
//		for(int i = 0 ; i<arr2.length; i++ ) {
//			for(int j = 0; j <arr2[i].length;j++ ) {
//				sum += arr2[i][j];
//			}
//		}
		for(int i=0; i<arr2.length; i++) {
			sum += ArrayFunc.sum(arr2[i]);
		}
		

		//-----------
		// 4*5 배열에 랜덤한 숫자를 넣으면 좋겠다.
		// 랜덤한 숫자의 범위는 10~50 사이면 좋겠다.
		// ArrayFunc클래스의 randomArr() 함수를 쓰면 좋음
		int arr3[][] = new int[4][5];
//		System.out.println(arr3.length);
		Random ran = new Random();
		for(int i = 0; i<arr3.length; i++ ) {
			for(int j = 0; j<arr3[i].length; j++) {
				arr3[i][j] = ran.nextInt(51)+10;
			}
		}
		System.out.println(Arrays.toString(arr3[0]));
		System.out.println(Arrays.toString(arr3[1]));
		System.out.println(Arrays.toString(arr3[2]));
		System.out.println(Arrays.toString(arr3[3]));
//		for(int i = 0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//		
	
	
	}
	
}
