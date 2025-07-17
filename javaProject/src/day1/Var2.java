package day1;

public class Var2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int에서 double은 문제 없음 
		// double에서 int로 바꾸면 데이터절삭발생
		int number = 10;
		System.out.println((double)number);
		
		// 10.5 -> 10 으로 소수점 소실발생
		double number2 = 10.5;
		System.out.println((int)number2);
	}

}
