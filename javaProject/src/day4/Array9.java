package day4;

import java.util.Scanner;

public class Array9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[] = { "자바", "오라클", "html/css", "js", "jsp" };
		// 과목중에 '오라클' 있으면 '있다'출력, 없으면 '없다'출력
		// 있으면 '있다' 출력, 없으면 '없다'출력
		Scanner s = new Scanner(System.in);
		System.out.print("과목 입력 : ");
		String subject = s.next();
		boolean flg = false;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(subject)) {
				flg = true;
				break;
			}
		}

		String result = flg ? "있다" : "없다";
		System.out.println(result);
		
//		if (flg) {
//			System.out.println("있다");
//		} else {
//			System.out.println("없다");
//		}


	}

}
