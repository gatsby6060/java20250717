package day3;

import java.util.Random;
import java.util.Scanner;

public class Loop_Ex1 {

	public static void main(String[] args) {
		// 랜덤 구구단 문제를 5문제 출제
		// 정답이면 "정답" 출력, 오답이면 "오답" 출력
		// 5문제를 다 푼 후에 한문제당 20점으로 가정하고 채점
		// ex)3문제를 맞추면 마지막에 "50점입니다." 출력
//		Random ran = new Random();
//		Scanner s = new Scanner(System.in);

//		System.out.print("원하는 문제 수를 입력해주세염: ");
//		int quiz_count = s.nextInt();
//		int ok_count = 0;
//
//		for (int i = 1; i <= quiz_count; i++) {
//			System.out.println("총 반복 횟수는 " + quiz_count);
//			int x = ran.nextInt(8) + 2; // 2~9
//			int y = ran.nextInt(9) + 1; // 1~9
//
//			System.out.print(i + "번 : " + x + " * " + y + " = ");
//			int answer = s.nextInt();
//
//			if (answer == 0) {
//				System.out.println("0을 입력하면 모든 문제는 그냥 중단됩니다.");
//				break;
//			}
//
//			if (answer == (x * y)) {
//				System.out.println("정답");
//
//				ok_count++;
//
//			} else {
//				System.out.println("오답");
//
//			}
//		}
//
//		System.out.println("총 " + quiz_count + "문제 중에 " + (ok_count) + "개를 맞췄습니다.");
		
		Random ran = new Random();
		Scanner s = new Scanner(System.in);
		
		System.out.print("원하는 문제수를 입력해 주세요 : ");
		int num = s.nextInt();
		System.out.println(num + "문제 풀이를 시작합니다. 정답에 0을 입력하면 종료됩니다.");
		
		int count = 0; // 정답 개수
		for(int i=1; i<=num; i++) {
			int x = ran.nextInt(8)+2; // 2~9
			int y = ran.nextInt(9)+1; // 1~9
			System.out.print(i+"번 문제 : " + x + " * " + y + " = ");
			int answer = s.nextInt();
			if(answer == (x*y)) {
				System.out.println("정답 입니다.");
				count++;
			} else if(answer == 0) {
				System.out.println("0일 입력하여 종료됩니다..");
				num = i-1;
				break;
			} else {
				System.out.println("오답 입니다.");
			}
		}
		System.out.println("총 " + num + "문제 중 " + count + "문제를 맞추셨습니다.");
	}

}
