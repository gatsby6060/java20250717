package review_day1;

public class Operator5 {

	public static boolean oddCheck(int num1) { // 홀수 체크
		if (num1 % 2 == 1) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 5;

		System.out.println(num1 > num2 | oddCheck(num1)); // 1개짜리는 뒤에까지 가서 비교함 약간 비효율적
		// 꼭 뒤에까지 실행하고 싶을때는 | 한개만 쓴다

	}

}
