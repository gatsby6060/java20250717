package day2;

public class Operator3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 논리 연산자
		// not, or, and
		// or(||) => 둘 중 하나라도 만족하면 true
		// and(&&) => 둘 다 만족해야 true
		System.out.println(true || true); //true
		System.out.println(true || false); //true
		System.out.println(false || false); //false
		
		int num1 = 5;
		int num2 = 10;
		System.out.println(num1 > 8 || num2 > 8); //true
		
		// and
		System.out.println(true && true); // true
		System.out.println(true && false); // false
		System.out.println(num1 > 8 && num2 > 8); //false
		
	}

}
