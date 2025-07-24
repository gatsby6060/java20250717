package day7;

import java.util.Arrays;

public class ArrayFunc {

	static int maxArr(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	static double avgArr(int[] arr) {
		double sum = 0;
//		double avg = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
//		avg = sum / arr.length;
		return (double) sum / arr.length;
	}

	// 아래는 내가 한것
//	static int[] oddArr(int[] arr) { // 홀수==odd 짝수==even
//
//		int j = 0; // 홀수가 몇개인지 개수 확인하서 이 숫자로 배열 만들것임
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] % 2 != 0) {
//				j++;
//			}
//		}
//
//		int[] arr2 = new int[j]; // 총 홀수가 몇개인지 확인후 그 갯수만큼 빈 배열 만들고 진행
//		int k = 0; // 이건 0 번째 1번째 2번째 조준용으로 만듬
//		for (int w = 0; w < arr.length; w++) {
//			if (arr[w] % 2 != 0) {
//				arr2[k] = arr[w];
//				k++;
//			}
//		}
//
//		return arr2;
//	}

	static int[] oddArr(int[] arr) {

		int oddCount = 0;
		int oddIndex = 0;
		for (int value : arr) { // 배열의 크기만큼 돌면서 value에 넣음(모조리 다 돌림)
			if (value % 2 == 1) { // 홀수면
				oddCount++;
			}
		}

		int oddArr[] = new int[oddCount];

		for (int i = 0; i < arr.length; i++) { // 배열의 크기만큼 돌면서 value에 넣음(모조리 다 돌림)
			if (arr[i] % 2 == 1) {
				oddArr[oddIndex++] = arr[i]; // [3, 5, 15, 7]
			}
		}
		return oddArr;
	}

	static int[] bigNumArr(int[] array) {

		int bigNumCount = 0;
		for (int value : array) {
			if (value >= 8) {
				bigNumCount++;
			}
		}

		int[] bigNumArray = new int[bigNumCount];
		int eightindex = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] >= 8) {
				bigNumArray[eightindex] = array[i];
				eightindex++;
			}
		}

		return bigNumArray;
	}

}
