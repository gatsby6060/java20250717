package day2;

public class Ex1 {

	public static void main(String[] args) {
		
		int num1 = 3;
		int num2 = 5;
		num1 += 5;
		System.out.println(num1); //8
		num2 -= 2;
		System.out.println(num2); // 3

		int num3 = 5; 
		int num4 = 10;
		System.out.println(num3 > 3); //true
		System.out.println(num4 < num4); // false
		System.out.println(num3 <= 5); // true
		System.out.println(num4 == 10); //true
		System.out.println(num3 != 8);//true

		System.out.println(num3 > 5 || num4 > 8); //true
		System.out.println(num3 > 3 && num4 > num3); //true
		System.out.println(!(num3 > 3) && num4 > num3); //false

	}

}
