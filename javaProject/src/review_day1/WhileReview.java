package review_day1;

import java.util.Scanner;

public class WhileReview {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		boolean flg = false;
		while (true) {

			s.nextLine();
			flg = !flg;  //왔다갔다 하게 함 true false
			System.out.println(flg); //스위치처럼... 껏다켰다
		}

	}

}
