package day15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (true) {
//			Scanner s = new Scanner(System.in);
			try {
				System.out.print("숫자 입력 1 : ");
				int num1 = s.nextInt();
				System.out.print("숫자 입력 2 : ");
				int num2 = s.nextInt();
				System.out.println(num1 / num2);
				break;
			} catch (ArithmeticException e) { // 0으로 나누는것만 잡아줌
				// TODO: handle exception
				System.out.println("0으로 나눌 수 없음");
			} catch (InputMismatchException e) { // 숫자를 입력 안하고 문자 입력할떄 잡아줌
				// TODO: handle exception
				System.out.println("숫자를 입력해라");
				s.nextLine(); //그냥 읽기만 해서 문자열을 비워서 버퍼를 비워서 무한루프 안빠지게 한다...
			}
		}
		
	}
}
