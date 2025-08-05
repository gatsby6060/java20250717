package day14;

import java.util.HashMap;

public class Review_Map1 {
	public static void main(String[] args) {
		// map =>{ name : "홍길동", age : 30, addr : "인천" }
//					키 : 밸류        키 밸류      키 밸류
//		HashMap<String, Integer> scoreMap = new HashMap<>();
//		scoreMap.put("java", 95);
//		scoreMap.put("oracle", 90);
//		scoreMap.put("html", 93);
//		
//		System.out.println(scoreMap);
	
		HashMap<String, Object> scoreMap = new HashMap<>();
		scoreMap.put("java", 95);
		scoreMap.put("oracle", 90);
		scoreMap.put("html", 93);
		scoreMap.put("name", "홍길동");
		
		System.out.println(scoreMap);
		
	
	}
}
