package day1;

public class Operator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 증감 연산자
		// ++, --
		
//		int num = 10;
//		num++; //		num = num + 1;
//		System.out.println(num);
//		num--; // num = num - 1;
//		System.out.println(num);
	
//		int num2 = 10;
//		++num2;
//		System.out.println(num2);
//		--num2;
//		System.out.println(num2);

		int num3 = 10;
		int num4 = num3++; //num4 = 10 num3 = 11
		System.out.println(num3); //num3 = 11
		System.out.println(num4); //num4 = 10

	
		
		
		int a = 3;
		int b = 5;
		b = a++; //b == 3    a==4
		int c = ++b; // c == 4 b ==4
		int d = ++a; // d ==5 a ==5
		
//		a == 5
//		b == 4
//		c == 4
//		d == 5
		
		System.out.println(a);		
		System.out.println(b);		
		System.out.println(c);		
		System.out.println(d);		
		
		
		
	}

}
