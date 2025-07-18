package day3;

import java.util.Scanner;

public class Day2_Review5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 숫자를 하나 입력 받아서 홀수면 '홀수' 짝수면 '짝수' 출력
		// 2. 숫자를 5번 입력 받아서 해당 숫자들의 합을 출력
		// 3. 숫자를 5번 입력 받아서 입력받은 수 중에서 가장 큰 수만 출력

		// 1. 숫자를 하나 입력 받아서 홀수면 '홀수' 짝수면 '짝수' 출력
		Scanner s = new Scanner(System.in);
//		System.out.print("숫자 입력 : ");
//		int input = s.nextInt();
//		if(input % 2 == 0) {
//			System.out.println("짝수");
//		}else {
//			System.out.println("홀수");
//		}

//		System.out.print("숫자 하나를 입력하세요 홀짝인지 구별해줄꼐영 : ");
//		Scanner s = new Scanner(System.in);
//		int inputvalue1 = s.nextInt();
//		if (inputvalue1 % 2 == 0) {
//			System.out.println("짝수내요");
//		} else {
//			System.out.println("홀수내요");
//		}

		// 2. 숫자를 5번 입력 받아서 해당 숫자들의 합을 출력
//		int sum = 0;
//		for(int i = 1; i<=5; i++) {
//			System.out.println(i + "번째 숫자 입력 : ");
//			int input = s.nextInt();
//			sum = sum + input; // sum += input;
//		}
//		System.out.println("총 합 : " + sum);

//		System.out.println("이제 숫자를 5번 입력받을거에요 그 숫자들의 합을 구해줄꼐요");
//		System.out.println("숫자 5개를 입력하세요");
//		int sum = 0;
//		Scanner s2 = new Scanner(System.in);
//		for (int i = 1; i <= 5; i++) {
//			System.out.print(i + "번째 숫자입력:");
//			sum += s2.nextInt();
//		}
//		System.out.println("당신이 입력한 5개의 합은 아래와 같습니다.");
//		System.out.println(sum);

		// 3. 숫자를 5번 입력 받아서 입력받은 수 중에서 가장 큰 수만 출력

		int max = 0;
		for (int i = 1; i <= 5; i++) {
			System.out.print(i + "번째 숫자 입력 : ");
			int input = s.nextInt();
			if (i==1) {
				max = input;
			}
			if(input > max) {
				max = input;
			}
		}
		System.out.println("큰 수  : " + max);
		
		
		// System.out.println("이제는 숫자 5개 입력하면 가장 큰수 1개를 보여줄꼐염");
//		System.out.println("숫자 5개 입력해주세요");
//		int i = 0;
//		Scanner scanner_i = new Scanner(System.in);
//		int bignumber = 0;
//		
//		for (i = 1; i <= 5; i++) {
//
//			System.out.print(i + "번째 숫자입력:");
//
//			int inputvalue = scanner_i.nextInt();
//			if (inputvalue > bignumber) {
//				bignumber = inputvalue;
//			}
//		}
//
//		System.out.println("가장큰수는 ");
//		System.out.println(bignumber);
	}

}
