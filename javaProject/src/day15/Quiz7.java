package day15;

import java.util.Scanner;
import java.util.TreeMap;

public class Quiz7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문자열을 입력받아서
		// 문자열 빈도 찾기
		// ex) Show me the money
		// s : 1, h : 2, o : 2, w : 1 ..... , y : 1
		// 대소문자 구분없이같이 카운팅
		// 공백은 체크X

		Scanner s = new Scanner(System.in);
		TreeMap<String, Integer> map = new TreeMap<>(); // map안에 여러 "키 밸류"가 들어갈수 있다 1개 아님...
		System.out.print("문자열 입력 : ");
		String str = s.nextLine();// 한줄 다 입력할떄 띄어쓰기도....

		System.out.print(str.toLowerCase());
		String str2 = str.toLowerCase();
		String[] arr = new String[str.length()];

		for (int i = 0; i < str.length(); i++) {
			String word = Character.toString(str2.charAt(i)).toLowerCase();
//			word = word.toLowerCase();
			if (word.equals(" ")) {
				continue;
			}
			if (map.containsKey(word)) {
				map.put(word, map.get(word) + 1);
			} else {
				map.put(word, 1);
			}
		}
		System.out.println(map);
		for (String key : map.keySet()) {
			System.out.print("[" + key + " : " + map.get(key) + "] ");
		}

//		for (int i = 0; i < str.length(); i++) {
//			// 캐릭터를 문자열로
//			arr[i] = Character.toString(str2.charAt(i));
//			// 문자열을 소문자로
//			System.out.println(arr[i]);
//			if (map.containsKey(arr[i])) {
//				map.put(arr[i], map.get(arr[i]) + 1);
//			} else {
//				map.put(arr[i], 1);
//			}
//		}
//
//		System.out.println(map); // 이거 키 밸류 여러개 있는거임
//
//		int max = 0;
//		for (String key : map.keySet()) {
//			if (max < map.get(key)) {
//				max = map.get(key);
//			}
//		}
//		System.out.println(max);
//		for (String key : map.keySet()) {
//			if (max == map.get(key)) {
//				System.out.println("가장 많은 글자 " + key + ", 개수 " + map.get(key));
//			}
//		}
	}

}
