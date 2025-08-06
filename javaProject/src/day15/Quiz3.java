package day15;

import java.util.Random;
import java.util.Scanner;

//3. 구구단 문제를 랜덤으로 생성하여 출력하고 사용자로부터 답을 입력 받으시오.
//조건 1. 기본적으로 랜덤 문제를 5번 제공한다.
//조건 2. 5문제 중 3문제 이상 정답을 맞췄을 경우 종료한다.
//조건 3. 5문제 중 3문제 이상 틀렸을 경우 위 과정을 다시 반복 한다.
//조건 4. print문으로 출력하는 문구는 자유롭게 정의한다.
public class Quiz3 {
	public static void main(String[] args) {
//		3. 구구단 문제를 랜덤으로 생성하여 출력하고 사용자로부터 답을 입력 받으시오.
//		for(int  i = 2; i<9; i++) {
//			for(int j = 1; j<=9; j++) {
//				System.out.println(i + " * " + j + " = "+i * j);
//			}
//		}

		Random ran = new Random();
//		int gugu1 = ran.nextInt(8)+2;
//		int gugu2 = ran.nextInt(9)+1;
		Scanner s = new Scanner(System.in);
		int count = 0;
		int minuscount= 0;
		do {
			for (int i = 1; i <= 5; i++) {
				System.out.println("기본적으로는 랜덤 문제를 " + i + "번 제공");
				int gugu1 = ran.nextInt(8) + 2;
				int gugu2 = ran.nextInt(9) + 1;
				System.out.print(gugu1 + " * " + gugu2 + " = ");
				int input = s.nextInt();
				if (input == gugu1 * gugu2) {
					System.out.println("정답입니다.");
					count++;
					if (count >= 3) {
						break;
					}
				} else {
					System.out.println("오답입니다. 정답은" + gugu1 * gugu2 + "입니다.");
					minuscount++;
				}
			}
			if(minuscount >= 3) {
				System.out.println("!!!!!!!!!!  3번이상 틀렸으니 또 돌린다.  !!!!!!!!!!!!!!");
			}
		}
		while (minuscount >= 3);


	}
}
