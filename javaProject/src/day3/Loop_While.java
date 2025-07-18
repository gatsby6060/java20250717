package day3;

import java.util.Scanner;

public class Loop_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int i = 0;
//		while (i < 10) {
//			System.out.println(i);
//			i++;
//		}

		// 1부터 사용자가 입력한 숫자까지 합을 구하기
		// while은 사용하기
//		System.out.print("1부터 사용자가 입력한 숫자까지의 합을 구하겠습니다. 숫자입력 : ");
//		Scanner s = new Scanner(System.in);
//		int num = s.nextInt();
//		int i = 1;
//		int sum = 0;
//		while (i <= num) {
//			sum += i;
//			i++;
//		}
//		System.out.println("1부터 사용자가 입력한 숫자까지의 총합은 " + sum);

		// 2. 구구단짜기
		// while문 사용하기

		System.out.println("이제 구구단을 짜볼까요?");
		int i = 2;
		
		while (i <= 9) {
			System.out.println("=====" + i + "단=====");
			int j = 1;
			while (j <= 9) {
				System.out.println(i + "*" + j + "=" + (i*j));
				j++;
			}
			i++;
			System.out.println(" ");

		}

	}

}
