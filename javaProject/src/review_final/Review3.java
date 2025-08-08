package review_final;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Review3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 향상된 for문
		// 삼항연산자
		int arr[] = { 1, 5, 2, 4, 6, 8 };
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		for (int num : arr) {
			System.out.print(num + " ");
		}
		HashMap<Integer, Integer> map = new HashMap<>();
		Random ran = new Random();
		for (int i = 1; i < 10; i++) {
			map.put(ran.nextInt(10) + 1, ran.nextInt(10) + 1);
		}
		System.out.println(map);
		for (int key : map.keySet()) {
			System.out.print(key + " ");
		}

		// 숫자하나 입력 바다서 10보다 크면 '큰 수'출력 작으면 '작은 수' 출력
		Scanner s = new Scanner(System.in);
		if (s.nextInt() > 10) {
			System.out.println("큰수");
		} else {
			System.out.println("작은 수");
		}

		// 조건 ? true일때 리턴 : false일 때 리턴;
		String str = s.nextInt() > 10 ? "큰 수" : "작은 수";
		System.out.println(str);

	}

}
