package day4;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. arr 배열에서 가장 큰 값 찾기
		int arr[] = { 21, 5, 10, 25, 3 };

		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] > max) {
				max = arr[i];
			}

		}
		System.out.println("가장큰 숫자는 " + max);
		
		//2. arr 배열에서 가장 큰 값의 위치(index) 찾기
		int maxIndex = 0;
		max = 0;
//		int arr[] = { 21, 5, 10, 25, 3 };
		for(int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[maxIndex]) {
				maxIndex = i;
			}
		}
		System.out.println("가장 큰 값의 위치는 "+ maxIndex + " 입니다.");

	}

}
