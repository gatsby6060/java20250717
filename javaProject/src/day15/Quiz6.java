package day15;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

//6. 20개의 공간을 가지는 배열을 생성하고, 랜덤한 숫자 1~10사이의 값을 20개의 공간에 모두 넣으시오.
//그 후, 중복된 숫자가 가장 많은 수의 숫자와 개수를 출력하시오.
//ex) [1,2,3,5,4,2,7,1,2,3,6,8,1,3,2,6,2,3,1,2]
//위처럼 배열이 생성된 경우 2는 6개로 가장 많으므로 
//'가장 많은 수 : 2, 개수 : 6' 형태로 출력
// -- 오늘 실습한 수도 맞추기 퀴즈에서 HashMap의 keyTable 형식을 참고하면 도움이 될 것
public class Quiz6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		int[] arr = new int[20];
		HashMap<Integer, Integer> map = new HashMap<>(); // map안에 여러 "키 밸류"가 들어갈수 있다 1개 아님...

		for (int i = 0; i < arr.length; i++) {

			arr[i] = ran.nextInt(10) + 1; // 1~10
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}

		System.out.println(map); // 이거 키 밸류 여러개 있는거임

		int max = 0;
		for (int key : map.keySet()) {
			if (max < map.get(key)) {
				max = map.get(key);
			}
		}
		System.out.println(max);
		for (int key : map.keySet()) {
			if (max == map.get(key)) {
				System.out.println("가장 많은 수 " + key + ", 개수 " + map.get(key));
			}
		}
	}

}
