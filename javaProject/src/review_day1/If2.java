package review_day1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class If2 {

	public static void main(String[] args) {

		// 랜덤한 숫자(1~10) 5개를 배열에 넣고
		// 사용자로부터 입력받은 숫자가 배열에 존재하면 "맞췃다!"
		// 없으면 "틀렸다" 출력

		boolean flg = false;

		int arr[] = new int[5];
		Random ran = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(10) + 1; // 1부터~10
		}
		System.out.println(Arrays.toString(arr));

		System.out.println("숫자를 입력하세요");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == a) {
				flg = true;
			}
		}
		if (flg == true) {
			System.out.println("맞췃다");
		} else {
			System.out.println("틀렸다.");
		}

	}
}
