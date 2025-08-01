package day12;

import java.util.Scanner;

public class StringRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String word = s.next();
		for(int i = 0; i<word.length(); i++) {
			String first = word.substring(0,1); //첫글자 때기
			String last = word.substring(1); //첫글자 뺴고 나머지 다
			word = last + first;   // 첫글자 맨뒤로 보내기
			System.out.println(word);
		}

	}

}
