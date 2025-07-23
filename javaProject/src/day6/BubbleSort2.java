package day6;

import java.util.Arrays;

public class BubbleSort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 3, 5, 1, 4, 2 }; // 내림차순정렬 목표 5 4 3 2 1로.... 버블정렬
		for (int j = 1; j < arr.length; j++) {
			for (int i = arr.length - 1; i > 0; i--) {
				if (arr[i - 1] < arr[i]) {
					int temp = arr[i];
					arr[i] = arr[i - 1];
					arr[i - 1] = temp;
				}
//				System.out.println(Arrays.toString(arr));
			}
		}

		System.out.println(Arrays.toString(arr));

	}

}
