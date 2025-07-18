package day3;

import java.util.Scanner;

public class Day2_Review3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num1 = s.nextInt();
		// if ~ else if
		// 90점 이상이면 'A 학점'
		// 80점 이상이면 'B 학점'
		// ...
		// 60점 미만이면 'F 학점'
		// 0~100 사이 값이 아닌 숫자를 입력했을 경우
		// '잘못된 정수입니다' 라고 출력

		// 0~100 사이 값을 입력할 경우 'A'출력
		// 아닐경우 'B'를 출력

		if (num1 >= 0 && num1 <= 100) {

			if (num1 >= 90) {
				System.out.println("A 학점");
			} else if (num1 >= 80) {
				System.out.println("B 학점");
			} else if (num1 >= 70) {
				System.out.println("C 학점");
			} else if (num1 >= 60) {
				System.out.println("D 학점");
			} else {
				System.out.println("F 학점");
			}

		} else {
			System.out.println("잘못된 점수 입니다.");
		}

	}

}
