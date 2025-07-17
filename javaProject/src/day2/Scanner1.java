package day2;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		
		Scanner s  = new Scanner(System.in);
		System.out.print("숫자를 입력해 주세요 : ");
		int num1 = s.nextInt();
		System.out.print("이름 입력해 주세요 : ");
		String name = s.next();
		
		System.out.println("입력한 숫자 : " + num1);
		System.out.println("입력한 이름 : " + name);
	}
	
}
