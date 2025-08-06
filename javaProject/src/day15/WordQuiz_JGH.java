package day15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class WordQuiz_JGH {

	public static ArrayList<HashMap<String, String>> quizList() {
		ArrayList<HashMap<String, String>> list = new ArrayList<>();
		String[] keys = { "멕시코", "스페인", "프랑스", "영국", "그리스", "독일", "중국", "러시아", "일본", "대한민국", "이탈리아", "캐나다", "브라질", "인도",
				"이집트", "호주", "터키", "노르웨이" };
		String[] values = { "멕시코시티", "마드리드", "파리", "런던", "아테네", "베를린", "베이징", "모스크바", "도쿄", "서울", "로마", "오타와", "브라질리아",
				"뉴델리", "카이로", "캔버라", "앙카라", "오슬로" };

		for (int i = 0; i < keys.length; i++) {
			HashMap<String, String> map = new HashMap<>();
			map.put(keys[i], values[i]);
			list.add(map);
		}
		return list;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		ArrayList<HashMap<String, String>> quizList = quizList();
		Random ran = new Random();
		System.out.println("수도 문제 풀이 ! [-1을 입력하면 종료됩니다.]");
		System.out.println("현재 총 " + quizList.size() + "문제가 있습니다!");

		while (true) {
			HashMap<String, String> quiz = quizList.get(ran.nextInt(quizList.size()));
			System.out.println(quiz);
			

			
			
			int ranNum = ran.nextInt(quizList.size());
			int onlyOneRanNum = 0;
			System.out.println("퀴즈사이즈" + quizList.size());
			ArrayList<String> onlyAry = new ArrayList<>();
//			System.out.println("랜덤번호는 " + ranNum);
			System.out.println();

//			for (String key : quiz.keySet()) { //keySet은 키 들만 가져오는 함수
//				System.out.print(key + "의 수도는 ? ");
//				String inputWords = s.next();
//
//				if (inputWords.equals("-1")) {
//					System.out.println("종료합니다.");
//					break;
//				}
//
//				if (quiz.get(key).equals(inputWords)) {
//					System.out.println("정답!");
//				} else {
//					System.out.println("오답! 정답은 :" + quiz.get(key));
//				}
//			}
			String country = "";
			String capital = "";
			for(String key : quiz.keySet()) { //keySet은 키 들만 가져오는 함수
//				if(onlyAry.get(key).equals(country))
				country = key;
				capital = quiz.get(key);
//				onlyAry.add(key);
			
			}
			System.out.print("[" + country + "]의 수도는 ? >> ");
			
			String inputWords = s.next();

			if (inputWords.equals("-1")) {
				System.out.println("종료합니다.");
				break;
			}

			if (quiz.get(country).equals(inputWords)) {
				System.out.println("정답!");
			} else {
				System.out.println("오답! 정답은 :" + quiz.get(country));
			}
			
			
		
		}
		
		
		
		

	}
}