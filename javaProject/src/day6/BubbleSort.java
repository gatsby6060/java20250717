package day6;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 5, 4, 7, 1, 3 };
//		for (int j = 1; j < arr.length - 1; j++) {
//			for (int i = 0; i < arr.length - j; i++) {
//				if (arr[i] > arr[i + 1]) {// 45713 45713 45173 45137 <--1회차일떄임 이걸 4(전체개수의-1)회차까지 돌려야 순서가 맞음 버블정렬
//					int temp = arr[i];
//					arr[i] = arr[i + 1];
//					arr[i + 1] = temp;
//				}
//			}
//		}
		for (int j = 1; j < arr.length; j++) {
			for (int i = 0; i < arr.length - j; i++) {
				if (arr[i] > arr[i + 1]) {// 45713 45713 45173 45137 <--1회차일떄임 이걸 4(전체개수의-1)회차까지 돌려야 순서가 맞음 버블정렬
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(arr));
	}

}
