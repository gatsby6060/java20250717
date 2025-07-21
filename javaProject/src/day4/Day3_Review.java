package day4;

import java.util.Scanner;

public class Day3_Review {

	public static void main(String[] args) {

		// 사용자로부터 양수 5개를 입력 받으세요.
		// 0이하의 숫자를 입력할 경우 다시 입력하도록 유도
		Scanner s = new Scanner(System.in);
		int count = 0;
		while (true) {
			System.out.print("양의 정수를 입력해주세요 : ");
			int num = s.nextInt();
			if (num >= 1) {
				count++;
				if (count >= 5) {
					System.out.println("5개 모두 입력했습니다.");
					break;
				}
			} else {
				System.out.println("1이상의 숫자를 입력해주세요.");
			}
		}

	}

}
