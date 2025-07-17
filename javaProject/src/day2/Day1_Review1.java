package day2;

public class Day1_Review1 {

	public static void main(String[] args) {
		// 당분간 여기서~
		// 문자를 저장할 때는  String 타입을 사용한다.
		String name = "홍길동";
		String addr = "인천";
		// 숫자(정수) 저장할 때는 int타입을 사용
		// byte, short, long(21억이 넘어가는 아주 큰 숫자들)
		int age = 30;
		
		// 숫자(실수)를 저장할 때는 double 타입을 사용
		// float도 사용가능하지만 숫자뒤에 f를 붙여야 한다.
		double height = 170.5;
		//참or거짓 저장할 때는 boolean타입을 사용한다.
		boolean isMarreid = true; // true or false
		
		System.out.println(name+"의 나이는 "+age+", 키는 "+ height+"입니다.");
	}

	
}
