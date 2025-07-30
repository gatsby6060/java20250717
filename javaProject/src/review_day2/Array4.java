package review_day2;

import java.util.Arrays;

public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 아래 조건에 맞는 배열 생성
		// 공간은 10개
		// 랜덤숫자범위 : 1~30

		int arr[] = ArrayFunc.randomArr(10, 1, 30);
//		System.out.println(Arrays.toString(arr));

		// 홀수배열 {1,9,25,19}
		// 짝수배열 {20,22,10,24,2,12}
		// oddArr ={1,9,25,19}
		// evenArr = {20,22,10,24,2,12}
		
//		ArrayFunc.oddArr(arr);
//		ArrayFunc.evenArr(arr);
		
		int oddSize = 0;
		int evenSize = 0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]%2 == 0) {
				evenSize++;
			}else {
				oddSize++;
			}
		}
		
		int oddArr[] = new int[oddSize];
		int evenArr[] = new int[evenSize];
		int oddIndex = 0;
		int evenIndex = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2 ==1) {
				oddArr[oddIndex++] = arr[i];
			} else {
				evenArr[evenIndex++] = arr[i];
			}
		}
		
		System.out.println(Arrays.toString(oddArr));
		System.out.println(Arrays.toString(evenArr));
	

	}

}
