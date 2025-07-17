package day2;

import java.util.Scanner;

public class IF_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사용자로부터 숫자를 입력받아서
		// 짝수이거나 3의 배수이면 '조건을 만족합니다.' 출력
		// 그렇지 않을 경우 '조건을 만족하지 않습니다.' 출력
		Scanner s = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num1 = s.nextInt();
		if (num1 % 2 == 0 || num1 % 3 == 0) {
			System.out.println("짝수이거나 3의 배수 조건을 만족합니다");
		} else {
			System.out.println("짝수이거나 3의 배수 조건을 만족하지 않습니다!");
		}

	}

}
