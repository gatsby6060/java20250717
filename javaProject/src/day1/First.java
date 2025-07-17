package day1;

public class First { 
	public static void main(String[] args) { //뭔지모르겠는데... 첫글자 대문자인 String은 클래스
		
		// 문자 = > String
		// 숫자(정수-소수점x) => int 21억 넘으면 long
		// 숫자(실수-소수점o) => double
		// 참 or 거짓 => booleans(true or false)
		String name = "홍길동";
		int age = 30;
		double height = 170.5;
		boolean married = false; //true or false

		// +
//		System.out.println("이름 : " + name);
//		System.out.println("나이 : " + (age + 5));
		
		// 위에서 선언한 변수를 이용해서
		// '홍길동의 나이는 30, 키는 170.5입니다.' 출력
		
//		System.out.println("홍길동의 나이는 30, 키는 170.5 입니다...");
//		System.out.println(name + "의 나이는 " + age + ", 키는 " + height +" 입니다.");
		System.out.println(name + "의 나이는 " + age + ", 키는 " + height + " 입니다.");
		
		
		
		
		
	} //main

}
