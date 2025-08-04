package day13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class QuizEx3 {

	public static int scoreFunc(String subject, int max) {
		Scanner s = new Scanner(System.in);
		int score = 0;
		while (true) {
			System.out.println(subject + " >> ");
			score = s.nextInt();
			if (score < 0 || score > max) {
				System.out.println(subject + "의 범위는 0부터 " + max + "까지 입니다.");
			} else {
				break;
			}
		}
		return score;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		System.out.println("======== 성적관리 시스템 ========");
		System.out.print("인원수 입력 : ");
		int humanCount = s.nextInt();
		String name;
		int java;
		int oracle;
		int html;

		for (int i = 0; i < humanCount; i++) {
			HashMap<String, Object> map = new HashMap<>(humanCount);

			System.out.print(" 이름 >> ");
			name = s.next(); // 요기서 무조건 입력전까지 대기임
			map.put("name", name);

//			System.out.print(" 자바 >> ");
//			java = s.nextInt();
			
			int score = scoreFunc("자바", 40);
			map.put("자바", score);
			
			
//			System.out.print(" 오라클 >> ");
//			oracle = s.nextInt();
//			scoreFunc("오라클", 35);
			map.put("오라클", scoreFunc("오라클", 35));
			

//			System.out.print(" html >> ");
//			html = s.nextInt();
//			scoreFunc("html", 25);
			map.put("html", scoreFunc("html", 25));
			

			list.add(map);
		}

		System.out.println("----------------------------------");

//		System.out.println(list);

		for (int i = 0; i < list.size(); i++) {
			HashMap<String, Object> map = list.get(i);
			int sum = (int) map.get("자바") + (int) map.get("오라클") + (int) map.get("html");
			System.out.println("이름 : " + map.get("name"));
			System.out.println("총합 : " + sum);
		}

	}
}
