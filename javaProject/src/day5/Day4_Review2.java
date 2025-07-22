package day5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Day4_Review2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 3, 5, 1, 4, 2 };
		int minIndex = 0;
		// 가장 작은 값의 위치 찾기(index)
		for (int i = 0; i < arr.length; i++) {
				if (arr[i] < arr[minIndex]) {
					minIndex = i;
			}
		}
		System.out.println("가장 작은 값의 위치는 " + minIndex);
//		System.out.println("가장 작은 값 :  " + arr[minIndex]);

		 int temp = arr[0];
		arr[0] = arr[minIndex];
		arr[minIndex] = temp;
		
		System.out.println(Arrays.toString(arr));
	}

}
