package day2;

import java.util.Scanner;

public class Switch_2 {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int score = s.nextInt();

		switch (score / 10) {
		case 10:
//			System.out.println("A 학점");
//			break;
		case 9:
			System.out.println("A 학점");
			break;
		case 8:
			System.out.println("B 학점");
			break;
		case 7:
			System.out.println("C 학점");
			break;
		case 6:
			System.out.println("D 학점");
			break;

		default:
			System.out.println("F 학점");
			break;
		}
	}

}
