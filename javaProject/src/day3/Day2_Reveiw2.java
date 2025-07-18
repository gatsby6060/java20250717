package day3;

import java.util.Scanner;

public class Day2_Reveiw2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 조건문
		// 단순 if, if ~ else, if ~ else if ~ else, 중첩 if
//		int num1 = 15;
		
//		if(num1 > 20) {
//			System.out.println("20보다 큽니다.");
//		}
		
		Scanner s = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num1 =  s.nextInt();
		
//		int num1 = 30;
		
		if(num1 > 20) {
			System.out.println("20 보다 큽니다.");
		} else {
			System.out.println("20 이하의 숫자 입니다.");
		} 

	}

}
