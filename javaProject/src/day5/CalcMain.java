package day5;

import java.util.Random;

public class CalcMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Calculator 클래스 이용해서
		// calc라는 이름의 객체를 생성
		Calculator calc = new Calculator();
		calc.intro();
		int number1 = calc.returnNumber();

		int number2 = calc.sum(20, 5);
		System.out.println(number2);

		int max = calc.max(5,8); //더 큰 함수를 리턴하는 함수 만들기
		System.out.println("max는 " + max);
		
		int arr[] = {3,5,1,4,2};
		int arrSum = calc.arrSum(arr);
//		System.out.println(arrSum);
		
//		Random ran = new Random();
		
		
		calc.intro2("홍길동", 30, 170.9);
	}

}
