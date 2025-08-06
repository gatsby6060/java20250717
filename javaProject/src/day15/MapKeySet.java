package day15;

import java.util.HashMap;
import java.util.Set;

public class MapKeySet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Object> map = new HashMap<>();
		map.put("name", "홍길동");
		map.put("age", 30);
		map.put("height", 170.5);
		map.put("isMarried", true);
		System.out.println(map);
		
//		Set<String> keys = map.keySet();
//		for(String key : keys) {
////			System.out.println(key);
//			System.out.println(map.get(key));;
//		}
		
		
		for(String key :  map.keySet()) {
//			System.out.println(key);
			System.out.println(map.get(key));;
		}
	}

}
