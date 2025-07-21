package day4;

import java.util.Arrays;

public class Array6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. arr 배열에서 가장 큰 값 찾기
		// 가장 작은 값의 위치도 찾기
		// 가장 큰 값과 작은 값의 위치 바꾸기
		int arr[] = { 21, 5, 25, 10, 3 };
		int maxIndex = 0;
		int minIndex = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > arr[maxIndex]) {
				maxIndex = i; // 인덱스 자체를 넣어야함....
			}
			if (arr[i] < arr[minIndex]) {
				minIndex = i;
			}
		}
		// 2. arr 배열에서 가장 큰 값의 위치(index) 찾기

		System.out.println("가장 큰 값의 위치는 " + maxIndex + " 입니다.");
		System.out.println("가장 작은 값의 위치는 " + minIndex + " 입니다.");

		// {20,5,25,10,3}
		// {20,5,3,10,3}

		// 가장 큰 값과 작은 값의 위치 바꾸기
		int temp = arr[maxIndex];
		arr[maxIndex] = arr[minIndex];
		arr[maxIndex] = temp;

		System.out.println(Arrays.toString(arr));

	}
}
