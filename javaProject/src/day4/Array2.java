package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Array2 {
	public static void main(String[] args) {
		// 1. arr1안에 있는 값들의 평균값 구하기
		int arr1[] = { 1, 5, 4, 2, 101 };

		double sum = 0;
		double avg = 0;
		for (int i = 0; i < arr1.length; i++) {
			sum += arr1[i];
		}
		avg = sum / arr1.length;

		System.out.println("난 평균임 : " + avg);

		// 2. 사용자로부터 값을 5개 입력받아서 숫서대로 arr2에 담기
		int arr2[] = new int[5];
		System.out.println("이제 5개를 입력해보시지");
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(i+1 + "번째 입력 숫자 : ");
			int inputNum = s.nextInt();
			arr2[i] = inputNum;
			// arr2[0] = 5;  {5,0,0,0,0}
			// arr2[1] = 3;  {5,3,0,0,0}
			// arr2[2] = 10; {5,3,10,0,0}
			// arr2[3] = 1;  {5,3,10,1,0}
			// arr2[4] = 100;{5,3,10,1,100}
		}
		System.out.println("arr2는" + Arrays.toString(arr2)); // 뭐 이렇게 써야 하나봄.... 출력하려면...

	}
}
