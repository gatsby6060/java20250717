package quiz;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class quiz8 {

//
//8. 아래 이미지를 참고하여 같은 결과가 나오도록 하시오.
// * 기본 절차 설명
//  - 최초에는 메뉴 선택 텍스트 출력
//  - 1을 입력할 경우 문제 풀이로 이동. 랜덤 구구단 문제 출제
//  - 문제를 맞추거나 틀림에 따라 상황에 맞는 텍스트 출력
//  - 정답에 0을 입력할 경우 메뉴 선택으로 이동
//  - 2를 누를경우 그동안 풀이 했던 문제의 정답 및 오답 개수 출력 후 메뉴 선택으로 이동
//  - 1~3외의 값을 입력할 경우 '1~3중 선택해 주세요' 텍스트 출력 후 메뉴 선택으로 이동
//  - 3을 누르면 '종료되었습니다' 출력 후 종료
	public static void main(String[] args) {

		int okScore = 0;
		int noSocre = 0;

		while (true) {
			System.out.println("=====메뉴선택======");
			System.out.print("[(1)문제풀이 (2)현재스코어 (3)종료] : ");
			Scanner s = new Scanner(System.in);

			int inputValue = s.nextInt();

			if (inputValue > 3 || inputValue < 1) {
				System.out.println("1~3중 입력해주세요");
				continue;
			}

			if (inputValue == 1) {
				System.out.println("문제풀이를 선택하셨습니다. 정답에 0을 입력하면 메뉴로 이동합니다.");

				Random ran = new Random();
				int x = 0;
				int y = 0;

				while (true) {
					x = ran.nextInt(8) + 2;
					y = ran.nextInt(9) + 1;
					System.out.print(x + "*" + y + "=");
					int guguInputValue = s.nextInt();

					if (guguInputValue == 0) {
						System.out.println("0을 입력하셨으므로 메뉴로 이동합니다.");
						break;
					}

					if (guguInputValue == x * y) {
						System.out.println("정답입니다");
						okScore++;
					} else {
						System.out.println("오답입니다!  정답은 " + x * y + " 입니다");
						noSocre++;
					}

				} // while

			} // inputValue ==1
			else if (inputValue == 2) {
				System.out.println("현재까지 맞춘 정답 개수 : " + okScore);
				System.out.println("현재까지 틀린 오답 개수 : " + noSocre);
			} else if (inputValue == 3) {
				System.out.println("종료되었습니다");
				break;
			}

		}
	}// 대형while문
}
