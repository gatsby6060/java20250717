package day2;

import java.util.Scanner;

public class Loop_For2 {
	public static void main(String[] args) {
//		long sum = 0; //1+2+3+4+5+6+7+8+9+10
//		for(long i=1; i<=999999999; i++) {
//			sum += i;
//			System.out.println(sum);
//		}
//		System.out.println(sum);

		
		// 숫자를 1개 입력받아서
		// 1부터 입력받은 숫자까지 모두 더하기
		// ex)20을 입력하면 1부터 20까지의 합 출력
		System.out.println("숫자하나 입력하세요 ");
		System.out.print("1부터 입력한 숫자로까지 더할께요 : " + "");
		Scanner s = new Scanner(System.in);

		int num1 = s.nextInt();
		int sum1 = 0;
		for (int i = 1; i <= num1; i++) {
//			sum1 = sum1 + i;
			sum1 += i;
		}
		System.out.println("1부터 당신이 입력한 숫자"+num1+"까지 의 정수의 합은 " + sum1 + "입니다.");
	}
}
