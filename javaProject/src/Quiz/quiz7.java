package Quiz;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class quiz7 {

//
//7. 5개의 공간을 가지는 배열을 선언하고,
//Random 클래스를 이용해 구한 랜덤한 숫자 1~30 사이의 숫자 5개를 배열에 넣으시오.
//단, 홀수만 넣을 것.
	public static void main(String[] args) {
		int[] array = { 0, 0, 0, 0, 0 };
		Random ran = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = ran.nextInt(30) + 1;
			if (array[i] % 2 == 0) {
				i--;
				continue;
			}
		}
		System.out.println(Arrays.toString(array));
	}
}

