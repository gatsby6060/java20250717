package day15;

import java.util.Scanner;

public class ScannerNextLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 스캐너 next()와 nextLine()
		Scanner s = new Scanner(System.in);

		System.out.print("숫자 입력 1 : ");
		// 10\nabc\n
		int num1 = s.nextInt(); // 10\n
		System.out.print("문자 입력 : ");
		String str = s.next(); // 여백을 구분해서 넣어줌
		System.out.print("숫자 입력 2 : ");
		int num2 = s.nextInt();

	}

}
