package day3;

import java.util.Random;
import java.util.Scanner;

public class Loop_Random2 {

	public static void main(String[] args) {
		// 랜덤 구구단 문제를 5문제 출제
		// 정답이면 "정답" 출력, 오답이면 "오답" 출력
		// 5문제를 다 푼 후에 한문제당 20점으로 가정하고 채점
		// ex)3문제를 맞추면 마지막에 "50점입니다." 출력
		Random ran = new Random();
		Scanner s = new Scanner(System.in);

		int count = 0;
//		int sumScore = 0;
		for (int i = 1; i <= 5; i++) {
			int x = ran.nextInt(8) + 2; // 2~9
			int y = ran.nextInt(9) + 1; // 1~9

			System.out.print(i + "번 : " + x + " * " + y + " = ");
			int answer = s.nextInt();
			if (answer == (x * y)) {
				System.out.println("정답");
				count++;
//				sumScore += 20;
			} else {
				System.out.println("오답");
			}
		}
//		System.out.println("점수는 " + sumScore + "점 입니다.");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
		System.out.println("점수는 " + (count*20) +"점 입니다.");

	}

}
