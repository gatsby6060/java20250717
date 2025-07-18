package day3;

import java.util.Random;
import java.util.Scanner;

public class Loop_While2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 랜덤 구구단 문제 출력
			//사용자가 5문제 맞추면  5문제 맞추셨습니다. 종료
		Random ran = new Random();
		Scanner s = new Scanner(System.in);
		System.out.println("랜덤 구구단 문제 풀이(0을 누르면 종료됩니다)");
		
		int count = 0;
		int x = 0;
		int y = 0;
		while (true) {
			x = ran.nextInt(8) + 2; //2~9
			y = ran.nextInt(9) + 1; //1~9
			
			System.out.print(x +" * " + y + " = ");
			int input = s.nextInt();
			
			if (input == 0) {
				System.out.println("0을 입력하면 종료합니다");
				break;
			}
			
			if(input == x*y) {
				++count;
				if(count==5) {
					System.out.println("5문제를 맞추셨습니다 프로그램 종료합니다.");
					break;
				}
			}
			
		}
	
	
	}

}
