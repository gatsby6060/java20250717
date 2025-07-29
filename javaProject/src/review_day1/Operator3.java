package review_day1;

public class Operator3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// >, <, >= , <= , == , !=
		int num1 = 10;
		int num2 = 5;
		System.out.println(num1 >= num2); // true
		if (num1 > num2) {
			System.out.println("num1이 num2보다 크다!");
		}

		System.out.println(num1 < num2);
		System.out.println(num1 > 10); // false
		System.out.println(num1 >= 10); // true

		System.out.println(num1 == 10); // true;
		System.out.println(num1 != 10); // false;

		System.out.println(!(num1 > num2)); //false
		System.out.println(!true); //false

	}

}
