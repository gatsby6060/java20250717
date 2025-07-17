package day2;

import java.util.Scanner;

public class IF_3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		// 나이를 입력받아서 나이에 따라 성인인지 아닌지 구별하는 코드
		System.out.print("나이를 입력해주세요 : ");
		int age = s.nextInt();

		if (age >= 19) {
			System.out.println("성인 입니다.");
		} else {
			System.out.println("성인이 아닙니다.");
		}

	}
}
