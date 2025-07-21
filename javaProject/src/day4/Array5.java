package day4;

import java.util.Arrays;
import java.util.Random;

public class Array5 {
	//이하 내꺼
/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 6개의 공간을 가지는 배열을 만들어서
		// 랜덤한 숫자 1~45사이의 값을 넣기
		int arr[] = new int[6];
		Random ran = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(45) + 1; // 1~45
			for (int j = 0; j < arr.length; j++) {
				System.out.println("진입 "+i +" "+ j);
				if (arr[i] == arr[j] && (i != j)) {
					System.out.println("i는" + i + "와 j는" + j + "중복된 숫자가 있었어서 다시 돌린다.");
//					arr[i] = ran.nextInt(45) + 1; // 또 똑같은거 나오면 지랄남 다시 그냥 돌려야 함
					if (i > 0) {
						--i;
					};					
					continue;

				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}
*/
	//이하 선생님꺼
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 6개의 공간을 가지는 배열을 만들어서
		// 랜덤한 숫자 1~45사이의 값을 넣기
		// 단, 중복이 없어야 함.
		int arr[] = new int[6];
		Random ran = new Random();
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = ran.nextInt(45)+1; // 1~45
			for(int j=0; j<i; j++) {
				if(arr[j] == arr[i]) {
					i--;
					break; //더이상 뒤에 비교할일이 없어서 for문 그냥 완전탈출용
					// 위 break가 없어도 정상동작은함 다만 뒤에도 비교하는것뿐
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	
	
}
