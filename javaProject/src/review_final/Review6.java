package review_final;

import java.util.ArrayList;
import java.util.HashMap;

public class Review6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// json => ArrayList + HashMap
		ArrayList<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(300);

		HashMap<String, Object> map = new HashMap<>();
		map.put("name", "홍길동");
		map.put("age", 30);

		ArrayList<HashMap<String, Object>> userList = new ArrayList<>();
		userList.add(map);
		System.out.println(userList);

	}

}
