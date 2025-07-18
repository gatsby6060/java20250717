package day3;

import java.util.Random;
import java.util.Scanner;

public class UpAndDown {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner s = new Scanner(System.in);

		System.out.println("Up & Down Game Start");
		System.out.println("범위는 1~100 사이입니다. 그 이상 이하를 입력하면 다시 시도하고 시도횟수에서는 제외됩니다.");

		int random = ran.nextInt(100) + 1;
		int count = 0;
		int lastHint = 11111111;
		int prevInput = 111111111; // 이전 입력값 저장

		while (true) {
			System.out.print("숫자 입력 : ");
			int answer = s.nextInt();

			if (answer < 1 || answer > 100) {
				System.out.println("범위는 1~100 사이입니다. 다시 입력하세요.");
				continue;
			}

			// 반대 방향 체크는 정답이 아닌 이전 입력값과 비교해야 함
			// 최초에는 실행 못함
			if (lastHint == 1 && answer < prevInput) {
				System.out.println("바보야 방금 Up이라고 했잖아... 왜 더 낮은 숫자를 입력하니? 다시 해. (카운트 안함)");
				continue;
			} else if (lastHint == 0 && answer > prevInput) {
				System.out.println("바보야 방금 Down이라고 했잖아... 왜 더 높은 숫자를 입력하니? 다시 해. (카운트 안함)");
				continue;
			}

			count++;
			if (answer < random) {
				System.out.println("Up");
				lastHint = 1;
			} else if (answer > random) {
				System.out.println("Down");
				lastHint = 0;
			} else {
				System.out.println("정답입니다!");
				System.out.println(count + "번 만에 맞추셨습니다.");
				break;
			}

			prevInput = answer; // 마지막에 이전값 저장
			
		}

	}
}
