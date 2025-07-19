package day3;

import java.util.Random;
import java.util.Scanner;

public class UpAndDown_jghtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		Scanner s = new Scanner(System.in);

		System.out.println("Up & Down Game Start");
		System.out.println("범위는 1~100 사이입니다 그 이상 이하를 입력하면 다시 시도하고 시도횟수에서는 제외됩니다.");
		int random = ran.nextInt(100) + 1;
		int count = 0;

		int updown = 123123123;
		int pre_number = 123123123;   
		while (true) {
			System.out.print("숫자 입력 : ");
			int answer = s.nextInt();
			if (!(answer >= 1 && answer <= 100)) {
				System.out.println("범위는 1~100 사이입니다 다시입력하세요");
				continue;
			} else {
				System.out.println("1부터 100사이 값을 입력해주세요");
			}

//			if (answer > 100 || answer < 1) {
//				System.out.println("범위는 1~100 사이입니다 다시입력하세요");
//				continue;
//			} 
			 
			if (random > answer) {
				if (updown == 1 && pre_number>answer) {
					System.out.println("바보야 방금 Up이라고 했자나... 왜 Down을 하니 다시 해 카운트는 안 한다");
					continue;
				}
				System.out.println("Up");
				updown = 1;
			} else if (random < answer) {
				if (updown == 0 && pre_number<answer) {
					System.out.println("바보야 아까 Down이라고 했자나... 왜 Up을 하니 다시 해 카운트는 안 한다");
					continue;
				}
				System.out.println("Down");
				updown = 0;
			} else {
				System.out.println("정답입니다!");
				break;
			}
			++count;
			pre_number = answer;
		}

		System.out.println(count + "번 만에 맞추셨습니다.");

	}

}
