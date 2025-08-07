package day16test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

//[문항6]  6. 20개의 공간을 가지는 배열을 생성하고, 랜덤한 숫자 1~10사이의 값을 20개의 공간에 모두 넣으시오.
//그 후, 중복된 숫자가 3개이상인 수의 숫자와 개수를 출력하시오. (15점)
//ex) [1,2,3,5,4,2,7,1,2,3,6,8,1,3,2,6,2,3,1,2]
//위처럼 배열이 생성된 1은 4개, 2는 6개, 3은 4개 있으므로
//' 1 => 4개
//2 => 6개
//3 => 4개
//' 형태로 출력
public class Quiz6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array20 = new int[20];
		Random ran = new Random();

		for (int i = 0; i < array20.length; i++) {
			int ranNum = ran.nextInt(10) + 1;
			array20[i] = ranNum;
		}
		System.out.println(Arrays.toString(array20));

		// 빈도수 계산
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int num : array20) {
			if (map.containsKey(num)) {
				map.put(num, map.get(num) + 1);
			} else {
				map.put(num, 1);
			}
		}

		for (int key : map.keySet()) { // 모든 키를 돌면서
			System.out.print(key + " => "); // 모든 키를 보여준다.
			System.out.println(map.get(key) + "개 "); // 키마다의 값을 보여준다.
		}
	}

}
