package day3;

public class Day2_Review1 {

	public static void main(String[] args) {

		int n2 = 5;
		int n3 = 10;
		System.out.println(n2 > n3); // false
		System.out.println(n2 < 10); // true
		System.out.println(n2 >= 5); // true
		System.out.println(n3 <= 10); // true
		System.out.println(n2 == n3); // false
		System.out.println(n2 != n3); // true

		// or(||) => 둘 중 하나라도 참이면 결과가 참(true)
		// and(&&) => 둘다 참이어야 결과가 참(true)
		// and, or
		System.out.println(n2 > n3 || n2 > 3); // true
		System.out.println(n2 > n3 && n2 > 3); // true
		
	}

}
