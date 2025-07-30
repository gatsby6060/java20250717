package review_day2;

import java.util.Arrays;
import java.util.Scanner;

//1. 배열 회전 프로그램
//사용자로부터 정수 배열(예: 5개)을 입력받고, 오른쪽으로 한 칸씩 회전시킨 결과를 출력하세요.
//예: 1 2 3 4 5 → 5 1 2 3 4

//2. 배열 두 개의 교집합 구하기
//두 개의 정수 배열을 입력받아 교집합에 해당하는 숫자들을 출력하세요.
//예: [1, 2, 3, 4], [3, 4, 5, 6] → 3, 4
//* 교집합에 해당하는 숫자를 새로운 배열에 넣는게 아니라 그냥 출력

public class quiz1 {
	public static void main(String[] args) {
		// 1. 배열 회전 프로그램
		// 사용자로부터 정수 배열(예: 5개)을 입력받고, 오른쪽으로 한 칸씩 회전시킨 결과를 출력하세요.
		// 예: 1 2 3 4 5 → 5 1 2 3 4
		int[] array = new int[5];
		Scanner s = new Scanner(System.in);
//		int input = s.nextInt();

		for (int i = 0; i < array.length; i++) {
			array[i] = s.nextInt();
		}
		System.out.println("array는 "+Arrays.toString(array));
		System.out.println("오른쪽으로 한칸씩 이동시킨 결과는");
	}

}
