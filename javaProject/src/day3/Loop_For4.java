package day3;

import java.util.Scanner;

public class Loop_For4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 9단부터 2단
		// 9 * 9 = 81
		// 9 * 8 = 72
		// 9 * 7 = 63
		// ...
		// ...
		// 2 * 1 =2

		// 숫자 하나 입력 받아서 해당 숫자 만큼 늘어나느 별찍기
		// ex) 4 를입력
		// *
		// **
		// ***
		// ****

		for (int i = 9; i >= 2; i--) {
			System.out.println("======== " + i + "단========");
			for (int j = 9; j >= 1; j--) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
			System.out.println();
		}

		System.out.print("별을 찍어 봅시다. 숫자를 입력하세요 : ");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}


		
	}

}
