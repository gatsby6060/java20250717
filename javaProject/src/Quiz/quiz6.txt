package quiz;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class quiz6 {


//6. 위 배열을 선언하고 배열 내에서 짝수 중 가장 큰 값의 위치를 출력하시오.
	public static void main(String[] args) {
		double[] array = { 3, 7, 10, 6, 15, 2 };
		double bigNum = array[0];
		int bigNumIndex = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] % 2 != 0) {
				continue;
			} else if (array[i] > bigNum) {
				bigNumIndex = i;
			}

			bigNum = array[bigNumIndex];

		}
		System.out.println("가장 (짝수)큰 값의 인덱스 위치 " + bigNumIndex);

	}
}

