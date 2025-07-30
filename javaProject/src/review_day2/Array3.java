package review_day2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 숫자 5개를 입력받아서 배열에 저장하고
		// 해당 배열의 평균을 구하세요
		Scanner s = new Scanner(System.in);

//		Scanner s = new Scanner(System.in);
//		int arr[] = new int[5];
//
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print((i + 1) + "번째 숫자 입력 : ");
//
//			arr[i] = s.nextInt();
//		}
//		System.out.println("평균:" + ArrayFunc.avg(arr));

		// ---------------------------------------
		// 5개의 공간을 가지는 배열에 랜덤한 숫자(1~10)사이 값을 넣고
		// 해당 값들 중에 가장 큰 값을 출력
		int arr2[] = new int[5];
		Random ran = new Random();
//		for (int i = 0; i < arr2.length; i++) {
//			arr2[i] = ran.nextInt(10)+1;
//		}
//
//		System.out.println(Arrays.toString(arr2));
//		System.out.println("큰 값 : "+ ArrayFunc.max(arr2));

//		int count = 0;
		// 추가 1. 중복 숫자 안나오도록....
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = ran.nextInt(10) + 1;
			for (int j = 0; j < i; j++) {
				if (arr2[i] == arr2[j]) {
					arr2[i] = ran.nextInt(10) + 1;
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(arr2));
		System.out.println("큰 값 : " + ArrayFunc.max(arr2));

		// 추가 1. 중복 숫자 안나오도록....

		int[] arr3 = ArrayFunc.randomArr(5, 20, 100);
		// 첫번째 파라미터 : 랜덤한 숫자의 개수(배열의 크기)
		// 두번째 파라미터 : 랜덤한 숫자의 시작 점
		// 세번째 파라미터 : 랜덤한 숫자의 끝
		// 결론 : 5개의 공간을 가지는 배열 생성 후
		// 20~100 사이의 랜덤한 값을 넣고 해당 배열리턴
		
		// 크기가 10이고 랜덤한 숫자 50~100사이 값을 배열에 넣어서 출력
		int[] arr4 = ArrayFunc.randomArr(10, 50, 200);
		System.out.println(Arrays.toString(arr4));

	}

}
