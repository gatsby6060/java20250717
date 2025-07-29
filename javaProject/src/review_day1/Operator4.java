package review_day1;

import java.util.Scanner;

public class Operator4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// and , or
		// and => 둘다 투르이면 결과가 true
//		System.out.println(true && true); //true
//		System.out.println(true && false); //false
//		System.out.println(false && true); //false
//		System.out.println(false && false); //false

		int num1 = 10;
		int num2 = 5;
		System.out.println(num1 > num2 && num1 % 2 == 0); // true
		System.out.println(num1 > 8 && num1 % 3 == 0);

		// or => 둘 중 하나라도 true 이면 결과가 true
		// 둘다 false일떄만 결과가 false
		System.out.println(true || true); // true
		System.out.println(true || false); // true
		System.out.println(false || true); // true
		System.out.println(false || false); // false

		// 입력받은 숫자가 짝수이거나 3의 배수이면 true 출력
		// 그렇지 않으면 false를 출력
		Scanner s = new Scanner(System.in);
		System.out.println("숫자 입력(짝수이거나 3의 배수인지 판별) : ");
		int input = s.nextInt();
//		if (input % 3 == 0 || input % 2 == 0) {
//			System.out.println("true");
//		}else {
//			System.out.println("false");
//		}
		System.out.println(input % 3 == 0 || input % 2 == 0);
	}

}
