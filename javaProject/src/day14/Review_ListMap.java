package day14;

import java.util.ArrayList;
import java.util.HashMap;

public class Review_ListMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		{java=95, oracle=90, name=홍길동, html=93}
		//map 하나만 가지고 관리는 하게 되면
		//map 하나당 사람 한명만 관리가 가능
		
		
		
		ArrayList< HashMap<String, Object> > list = new ArrayList<>(); // 그냥 이렇게 해... Object쓰면 나중에 다운 캐스팅해야함

		HashMap<String, Object> hong = new HashMap<>();
		hong.put("name", "홍길동");
		hong.put("age", 30);
		HashMap<String, Object> kim = new HashMap<>();
		kim.put("name", "김철수");
		kim.put("age", 20);
		HashMap<String, Object> park = new HashMap<>();
		park.put("name", "박영희");
		park.put("age", 25);
		
		list.add(hong);
		list.add(kim);
		list.add(park);
		
		System.out.println(list);

	}

}
