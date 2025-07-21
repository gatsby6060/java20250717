package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Array4 {
	
	public static void main(String[] args) {

		// 1. 사용자로부터 숫자 5개를 입력받아서 배열에 저장
		// 단 0이하의 숫자를 입력할 경우 다시 입력하도록
//		System.out.println(Arrays.toString(arr));
		int arr[] = new int[5];

		System.out.println("숫자 5개 입력하세요 0이하 안됩니다. 마이너스 입력하면 안됩니다.");
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.println((i+1)+"번째 숫자 입력 : ");
			arr[i] = s.nextInt();
			if (arr[i] <= 0) { // 툴이 바보라 for문 안에서 가끔 sysout안먹힘
				System.out.println("1이상의 숫자를 입력하세요.");
				i--;
			}
		
		}
		System.out.println(Arrays.toString(arr));
		

	}
}
