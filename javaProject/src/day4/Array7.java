package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Array7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사용자로부터 배열의 크기를 입력받아서
		// 해당 크기의 배열 생성
		// 배열 내의 값은 1부터 배열크기까지 순차적으로 넣기
		// ex) 3을 입력하면 {1,2,3} <- 크기 3의 배열 생성
		// ex) 7을 입력하면 {1,2,3,4,5,6,7} <- 크기 7의 배열 생성

		// size가 0이하의 숫자가 들어오면 다시 입력하도록

		Scanner s = new Scanner(System.in);
//		System.out.print("배열 크기 입력 : ");
//		int size = 0;
//		while(true) {
//			size = s.nextInt();
//			if(size <= 0) {
//				System.out.print("1이상의 숫자를 입력 : ");
//			} else {
//				break;
//			}
//		}

		int size = 0;
		do {
			System.out.print("배열 크기 입력(1이상) : ");
			size = s.nextInt();
		} while (size <= 0);

		int arr[] = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		System.out.println(Arrays.toString(arr));

	}
}
