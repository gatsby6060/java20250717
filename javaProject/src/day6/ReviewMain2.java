package day6;

import java.util.Scanner;

public class ReviewMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc_Review calc = new Calc_Review();
		
		// 오버로딩은 호출할 때 데이터 타입이나 개수로 구분
		
		int a = calc.sum(10, 5);
		double b = calc.sum(10.5, 3);
		double c = calc.sum(5.8, 9.2);
		int d = calc.sum(3, 5, 12);
		
		Scanner s = new Scanner(System.in);
		String subject = "자바";
		
		System.out.println("현재 우리가 배우는 과목명은 : ");
		String answer = s.next();
		
		if(subject.equals(answer)) { //문자열 비교는 equals써야함...
			System.out.println("정답");
		} else {
			System.out.println("오답");
		}
		
		
	}

}
