package review_day3;

import review_day2.ArrayFunc;

public class FinalVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = ArrayFunc.randomArr(10, 1, 30); //10개의 배열안에 1~30숫자가 있음
		int num = ArrayFunc.arrLength(arr, ArrayFunc.EVEN);
		int num2 = ArrayFunc.arrLength(arr, ArrayFunc.ODD);
	}

}
