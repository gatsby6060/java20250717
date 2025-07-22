package day5;

import java.util.Arrays;

public class SelectionSort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 3, 4, 1, 5, 2 };
		int minIndex = 0;

		for (int i = 1; i < arr.length; i++) {
			if (arr[minIndex] > arr[i]) {
				minIndex = i;
			}
		}
		int temp = arr[0];
		arr[0] = arr[minIndex];
		arr[minIndex] = temp;
		System.out.println(Arrays.toString(arr));
		//[1, 4, 3, 5, 2]

		
		// === 2회차 ===
		minIndex = 1;
		for (int i = 2; i < arr.length; i++) {
			if (arr[minIndex] > arr[i]) {
				minIndex = i;
			}
		}
		temp = arr[1];
		arr[1] = arr[minIndex];
		arr[minIndex] = temp;
		System.out.println(Arrays.toString(arr));
		//[1, 2, 3, 5, 4]
		
		// === 3회차 ===
		minIndex = 2;
		for (int i = 3; i < arr.length; i++) {
			if (arr[minIndex] > arr[i]) {
				minIndex = i;
			}
		}
		temp = arr[2];
		arr[2] = arr[minIndex];
		arr[minIndex] = temp;
		System.out.println(Arrays.toString(arr));
		//[1, 2, 3, 5, 4]
		
		// === 4회차 ===
		minIndex = 3;
		for (int i = 4; i < arr.length; i++) {
			if (arr[minIndex] > arr[i]) {
				minIndex = i;
			}
		}
		temp = arr[3];
		arr[3] = arr[minIndex];
		arr[minIndex] = temp;
		System.out.println(Arrays.toString(arr));
		//[1, 2, 3, 4, 5]

	}

}
