package review_day1;

public class Operator2 {

	public static void main(String[] args) {

//		int a = 10;
//		a++; // a=a+1 a+=1;

//		int b = a++;
//
//		System.out.println(a);
//		System.out.println(b);
		
		int a = 10;
		int b = ++a; //b==11 a==11
		int c = b++; //c==11 b==12
		int d = c++; //d==11 c==12
		a = b--; //a==12 b== 11
		System.out.println(a); // 12
		System.out.println(b); // 11
		System.out.println(c); // 12
		System.out.println(d); // 11
	}

}
