package day2;

public class Day1_Review2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 연산자(1. 사칙연산)
		// 숫자 + 숫자 => 숫자
		// 문자 + 숫자 => 문자(문자가 1개라도 있으면 결과가 문자로 출력됨)
		String name = "홍길동";
		int age = 30;
		System.out.println(name+age); // 홀길동30
		System.out.println(age+"5"); // 
		System.out.println(name + age + 5); //홀길동305
		System.out.println(name + (age + 5)); //홍길동35
		
		// 정수와 정수의 계산 결과는 정수
		// 실수와 정수의 계산 결과는 실수(실수가 1개라도 있으면 결과는 실수)
		int num1 = 10;
		int num2 = 4;
		System.out.println(num1 / num2); //2
		System.out.println(num1 / (double)num2); //2.5
		double num3 = 4.0;
		System.out.println(num1 / num3); //2.5
		
		System.out.println("-------------");
		// % -> 나머지 연산(나누었을 때 나머지 값을 리턴)
		int num4 = 10;
		System.out.println(num4 % 2); // 0 //홀짝 구분할때... 씀
		System.out.println(num4 % 3); // 1 //3의 배수 찾을떄 씀
		System.out.println(num4 % 4); // 2
		
	}

}
