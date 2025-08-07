package day16test;

//[문항2]  2. 1부터 50까지 숫자 중 20~29를 제외하고 출력하시오. (20점)
//조건 1. 반복문과 조건문을 사용할 것

public class Quiz2 {
	public static void main(String[] args) {
		for (int i = 1; i <= 50; i++) {

			if (!(i >= 20 && i <= 29)) {
				System.out.println(i);
			}

		}
	}
}
