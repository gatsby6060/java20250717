package quiz;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class quiz5 {

//[배열 공통 문제]
//배열 : {3, 7, 10, 6, 15, 2}	
//5. 위 배열을 선언하고 배열 내에 있는 모든 숫자들의 합과 평균을 출력하시오.
	public static void main(String[] args) {
		double[] array = { 3, 7, 10, 6, 15, 2 };
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		System.out.println("모든 숫자의 합 : " + sum);
		System.out.println("모든 숫자의 평균 : " + sum / array.length);
	}
}

