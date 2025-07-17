package day2;

import java.util.Scanner;

public class IF_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 학년과 점수는 사용자로부터 입력을 받는다.
		// 1~3학년은 점수가 60점 이상이면 합격
		// 4~6학년은 점수가 80점 이상이면 합격
		Scanner s = new Scanner(System.in);
		System.out.println("학년 입력 : ");
		int grade = s.nextInt();
		System.out.println("점수 입력 : ");
		int score = s.nextInt();

		// grade는 1부터 6까지만 입력한다고 가정
		if (grade >= 1 && grade <= 3) {
			// grade 1~3
			if (score >= 60) {
				System.out.println("합격");
			}
		} else if (grade >= 4 && grade <= 6) {
			// grade 4~6
			if (score >= 80) {
				System.out.println("합격");
			}
		} else {
			//1~6 이외의 숫자
			System.out.println("1~6이외의 숫자");
		}

	}

}
