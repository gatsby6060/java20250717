package day16test;

import java.util.Random;

//[문항5]  5. ArrayManager 클래스를 작성하시오. (10점)
//조건 1. int형 배열을 매개변수(인자)로 받아서 배열내에서 가장 큰 수와 가장 작은 수의 차이를 리턴하는 메소드를 작성하시오.
//조건 2. 함수 호출 시 랜덤한 5개의 숫자를 int형 배열에 담고 해당 배열을 리턴해주는 함수를 작성하시오.
//단, 랜덤한 숫자는 -15~15 범위의 값이어야 함.
//조건 3. 모든 메소드는 ststic으로 선언할 것.
//조건 4. 외부함수 사용에 대한 제약 없음.
public class ArrayManager {

	public static int arrayManagerfunc(int[] array1) {

		int[] array2 = array1;

		int max = array2[0];
		int min = array2[0];
		for (int i = 0; i < array2.length; i++) {
			if (max < array2[i]) {
				max = array2[i];
			}

			if (min > array2[i]) {
				min = array2[i];
			}
		}

		return max - min;
	}

	// 조건 2. 함수 호출 시 랜덤한 5개의 숫자를 int형 배열에 담고 해당 배열을 리턴해주는 함수를 작성하시오.
	//단, 랜덤한 숫자는 -15~15 범위의 값이어야 함.
	public static int[] random5int() {
		// TODO Auto-generated method stub
		Random ran = new Random();
		int[] array5 = new int[5];
		for (int i = 0; i < 5; i++) {
			int ranNum = ran.nextInt(31)-15;
//			System.out.println(ranNum);
			array5[i] = ranNum;
		}
		return array5;
	}

}
