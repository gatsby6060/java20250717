package day15;

import java.util.Scanner;

public class ExceptionEx1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("숫자 입력 1 : ");
		int num1 = s.nextInt();
		System.out.print("숫자 입력 2 : ");
		int num2 = s.nextInt();
		
			
		try {
			System.out.println(num1/num2);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("0으로 나눌 수 없음");
		}
	}
}
