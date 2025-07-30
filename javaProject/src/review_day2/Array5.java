package review_day2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Array5 {
	public static void main(String[] args) {

		int arr[] = ArrayFunc.randomArr(10, 1, 30);

		System.out.println(Arrays.toString(arr));
		
		int oddSize = ArrayFunc.arrLength(arr, "odd");
		int evenSize = ArrayFunc.arrLength(arr, "even");
	
		
//		System.out.println("홀수 사이즈 "+oddSize);
//		System.out.println("짝수 사이즈 "+evenSize);
	
		int[] oddArr =  ArrayFunc.returnArr(arr, "odd", oddSize);
		//홀수들만 담긴 배열을 리턴
		System.out.println(Arrays.toString(oddArr));
		
		int oddArr2[] =  ArrayFunc.returnArr(arr, "odd");
		System.out.println(Arrays.toString(oddArr2));
		//홀수들만 담긴 배열을 리턴
	}
}
