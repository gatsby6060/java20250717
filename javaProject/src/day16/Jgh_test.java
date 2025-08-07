package day16;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Jgh_test {

//	1. 클래스, 객체, 상속에 대해 각각 설명하시오.
//	클래스 : 객체를 만들기 위한 설계도 부분 클래스 1개로 여러 객채를 구분하여 만들수 있다.
//	객채 : 클래스를 통해서 나온 실제 결과물. 같은 클래스로 여러 객체를 만들수 있고 객체마다 구분 가능하다.
//	상속 : 클래스마다 중복되면 다른 클래스에 중복되는 부분을 코딩할수있다. 나중에 중복되는 코드를 부모클래스로 만들고 자식클래스 에서 extends하면 자식클래스가 상속받는(==하는)다.
//	그러면 super.함수명 이렇게 쓰거나 그냥 함수명으로 쓰면 된다.

//	2. 1부터 50까지 숫자 중 짝수이거나 5의 배수인 숫자를 출력하시오.
//	 조건 1. 반복문과 조건문을 사용할 것
//	public static void main(String[] args) {
//		for (int i = 1; i <= 50; i++) {
//			if (i % 5 == 0) {
//				System.out.println(i);
//			}
//		}
//	}

//	3. 구구단 문제를 랜덤으로 생성하여 출력하고 사용자로부터 답을 입력 받으시오.
//	 조건 1. 기본적으로 랜덤 문제를 5번 제공한다.
//	 조건 2. 5문제 중 3문제 이상 정답을 맞췄을 경우 종료한다.
//	 조건 3. 5문제 중 3문제 이상 틀렸을 경우 위 과정을 다시 반복 한다.
//	 조건 4. print문으로 출력하는 문구는 자유롭게 정의한다.
//	public static void main(String[] args) {
//
//		Random ran = new Random();
//		int correct = 0;
//		int inCorrect = 4;
//		Scanner s = new Scanner(System.in);
//
//		while (inCorrect > 3) {
//			inCorrect = 0;
//			for (int i = 1; i <= 5; i++) {
//				if (correct >= 3) {
//					break;
//				}
//				System.out.println("문제 " + i);
//				int x = ran.nextInt(8) + 2;
//				int y = ran.nextInt(9) + 1;
//
//				System.out.print(x + "*" + y + " = ");
//				int userInput = s.nextInt();
//				if (userInput == x * y) {
//					System.out.println("정답입니다.");
//					correct++;
//				} else {
//					inCorrect++;
//				}
//
//			}
//		}
//	}

//	4. 첨부된 코드를 참고하여 오류나는 부분 및 주석을 참고하여 정상 동작하도록 수정하시오.
//	-- 첨부파일 하단 참고 
//	public static void main(String[] args) {
//		Dog dog = new Dog("소행성파괴자", 2);
//		dog.sound();
//	}

//	5. ArrayManager 클래스를 작성하시오.
//	 조건 1. int형 배열을 매개변수(인자)로 받아서 두번째로 큰 숫자를 리턴해주는 함수를 작성하시오.
//	 조건 2. 함수 호출 시 랜덤한 5개의 숫자 int형 배열에 담고 해당 배열을 리턴해주는 함수를 작성하시오.
//	        단, 랜덤한 숫자는 홀수이면서 1~30사이의 값이어야 함.
//	 조건 3. 모든 메소드는 ststic으로 선언할 것.
//	 조건 4. 외부함수 사용에 대한 제약 없음.

//	public static int[] arrayfunc() {
//		int[] array = new int[5];
//		Random ran = new Random();
//		
//		for(int i = 0 ; i < array.length; i++) {
//			int ranNum = ran.nextInt(30)+1;
//			array[i] = ranNum;
//		}
//		System.out.println(Arrays.toString(array));
//		
//		return array;
//	} 
//	
//	public static void main(String[] args) {
//		
//		int[] arr = arrayfunc();
//		
//		Arrays.sort(arr);
//		
//		System.out.println(Arrays.toString(arr));
//		
//		System.out.println(arr[1]);
//		
//	}
	
	
//	6. 20개의 공간을 가지는 배열을 생성하고, 랜덤한 숫자 1~10사이의 값을 20개의 공간에 모두 넣으시오.
//	그 후, 중복된 숫자가 가장 많은 수의 숫자와 개수를 출력하시오.
//	ex) [1,2,3,5,4,2,7,1,2,3,6,8,1,3,2,6,2,3,1,2]
//	위처럼 배열이 생성된 경우 2는 6개로 가장 많으므로 
//	'가장 많은 수 : 2, 개수 : 6' 형태로 출력
//	 -- 오늘 실습한 수도 맞추기 퀴즈에서 HashMap의 keyTable 형식을 참고하면 도움이 될 것

	public static int[] arrayMakefunc() {
		int[] array = new int[20];
		Random ran = new Random();
		
		for(int i = 0 ; i < array.length; i++) {
			int ranNum = ran.nextInt(10)+1;
			array[i] = ranNum;
		}
		System.out.println(Arrays.toString(array));
		return array;
	}
	
	public static void main(String[] args) {

		int[] arr1 = arrayMakefunc();
		
        // 빈도수 계산
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr1) {
			if (map.containsKey(num)) {
				map.put(num, map.get(num) + 1);
			} else {
				map.put(num, 1);
			}
        }
        
        System.out.println(map);
        
        // 최대반복 횟수 찾기
		int max = 0;
		for (int key : map.keySet()) { // 모든 키를 돌면서 
			if (max < map.get(key)) {  // 모든 키를 돌면서 키값의 최대치를 찾아낸다.
				max = map.get(key);
			}
		}
		System.out.println(max); // 키값의 최대치
		
		//어떤숫자가 최대반복횟수와 같은지 찾기
		for (int key : map.keySet()) { //그럼 도대체 몇번의 숫자가 최대치와 같은지 찾는다.
			if (max == map.get(key)) {
				System.out.println("가장 많은 수 " + key + ", 개수 " + map.get(key)); //시마이
			}
		}


	}
	
	
//	7. HashMap + ArrayList를 이용한 문제로 예시 문제로 따로 제공 안함.
}
