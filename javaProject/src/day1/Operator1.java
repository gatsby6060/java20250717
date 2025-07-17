package day1;

public class Operator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 3;
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		System.out.println(num1 % num2);
		
		// 정수와 정수의 계산 결과는 무조건 결과가 정수
		// 수를 계산할 때 하나라도 실수(소수점)가 있다면 결과가 무조건 실수
		
		System.out.println((double)num1 / num2);
		
		int num3 = 10;
		double num4 = 3;
		System.out.println(num3 /num4);
		
		if(num1 % 2 == 0 ) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		
	}

}
