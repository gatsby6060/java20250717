package Quiz;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class quiz {
//	1. 아래 조건에 맞게 변수 선언 및 초기화 하고 변수를 이용하여 결과를 출력하시오.
//	- 변수명 : name 	 , 값 : 홍길동
//	- 변수명 : age  	 , 값 : 30
//	- 변수명 : height , 값 : 170.9
//출력 결과 : 홍길동의 나이는 30, 키는 170.9 입니다.
	public static void main(String[] args) {
		String name = "홍길동";
		int age = 30;
		double height = 170.9;
		
		System.out.println(name+"의 나이는" + age + ", 키는 " + height + " 입니다.");
	}
}

//2. 스캐너를 통해 숫자를 입력받은 후 
//홀수일 경우 "홀수", 짝수일 경우 "짝수"를 출력하시오.
//단, 0이하의 숫자나 11이상의 숫자일 경우 "계산할 수 없습니다." 를 출력하시오.
//	public static void main(String[] args) {
//
//		Scanner s = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요.");
//		int inputValue = s.nextInt();
//		if(inputValue <= 0 || inputValue >= 11) {
//			System.out.println("계산할 수 없습니다.");
//		} else if(inputValue % 2 == 0) {
//			System.out.println("짝수");
//		}else {
//			System.out.println("홀수");
//		}
//	}
//}

//3. 스캐너를 통해 숫자를 하나 입력받고, 해당 숫자의 구구단을 역순으로 출력하시오.
//(ex, 2입력시 2*9=18, 2*8=16, 2*7=14 ... 2*1=2 출력)
//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		int inputValue = s.nextInt();
//
//		for (int i = 9; i >= 1; i--) {
//			System.out.print(inputValue + "*");
//			System.out.print(i);
//			System.out.println("=" + inputValue * i);
//		}
//	}
//}

//4. 구구단을 출력하시오. 
//단, 5단과 8단은 제외하고 출력
//	public static void main(String[] args) {
//		for (int i = 2; i <= 9; i++) {
//			if (i == 5 || i == 8) {
//				continue;
//			}
//			for (int j = 1; j <= 9; j++) {
//				System.out.println(i + " * " + j + " = " + i * j);
//			}
//		}
//	}
//}

//[배열 공통 문제]
//배열 : {3, 7, 10, 6, 15, 2}	
//5. 위 배열을 선언하고 배열 내에 있는 모든 숫자들의 합과 평균을 출력하시오.
//	public static void main(String[] args) {
//		double[] array = { 3, 7, 10, 6, 15, 2 };
//		double sum = 0;
//		for (int i = 0; i < array.length; i++) {
//			sum += array[i];
//		}
//		System.out.println("모든 숫자의 합 : " + sum);
//		System.out.println("모든 숫자의 평균 : " + sum / array.length);
//	}
//}

//6. 위 배열을 선언하고 배열 내에서 짝수 중 가장 큰 값의 위치를 출력하시오.
//	public static void main(String[] args) {
//		double[] array = { 3, 7, 10, 6, 15, 2 };
//		double bigNum = array[0];
//		int bigNumIndex = 0;
//		for (int i = 1; i < array.length; i++) {
//			if (array[i] % 2 != 0) {
//				continue;
//			} else if (array[i] > bigNum) {
//				bigNumIndex = i;
//			}
//
//			bigNum = array[bigNumIndex];
//
//		}
//		System.out.println("가장 (짝수)큰 값의 인덱스 위치 " + bigNumIndex);
//
//	}
//}

//
//7. 5개의 공간을 가지는 배열을 선언하고,
//Random 클래스를 이용해 구한 랜덤한 숫자 1~30 사이의 숫자 5개를 배열에 넣으시오.
//단, 홀수만 넣을 것.
//	public static void main(String[] args) {
//		int[] array = { 0, 0, 0, 0, 0 };
//		Random ran = new Random();
//		for (int i = 0; i < array.length; i++) {
//			array[i] = ran.nextInt(30) + 1;
//			if (array[i] % 2 == 0) {
//				i--;
//				continue;
//			}
//		}
//		System.out.println(Arrays.toString(array));
//	}
//}

//8. 아래 이미지를 참고하여 같은 결과가 나오도록 하시오.
// * 기본 절차 설명
//  - 최초에는 메뉴 선택 텍스트 출력
//  - 1을 입력할 경우 문제 풀이로 이동. 랜덤 구구단 문제 출제
//  - 문제를 맞추거나 틀림에 따라 상황에 맞는 텍스트 출력
//  - 정답에 0을 입력할 경우 메뉴 선택으로 이동
//  - 2를 누를경우 그동안 풀이 했던 문제의 정답 및 오답 개수 출력 후 메뉴 선택으로 이동
//  - 1~3외의 값을 입력할 경우 '1~3중 선택해 주세요' 텍스트 출력 후 메뉴 선택으로 이동
//  - 3을 누르면 '종료되었습니다' 출력 후 종료
//	public static void main(String[] args) {
//
//		int okScore = 0;
//		int noSocre = 0;
//
//		while (true) {
//			System.out.println("=====메뉴선택======");
//			System.out.print("[(1)문제풀이 (2)현재스코어 (3)종료] : ");
//			Scanner s = new Scanner(System.in);
//
//			int inputValue = s.nextInt();
//
//			if (inputValue > 3 || inputValue < 1) {
//				System.out.println("1~3중 입력해주세요");
//				continue;
//			}
//
//			if (inputValue == 1) {
//				System.out.println("문제풀이를 선택하셨습니다. 정답에 0을 입력하면 메뉴로 이동합니다.");
//
//				Random ran = new Random();
//				int x = 0;
//				int y = 0;
//
//				while (true) {
//					x = ran.nextInt(8) + 2;
//					y = ran.nextInt(9) + 1;
//					System.out.print(x + "*" + y + "=");
//					int guguInputValue = s.nextInt();
//
//					if (guguInputValue == 0) {
//						System.out.println("0을 입력하셨으므로 메뉴로 이동합니다.");
//						break;
//					}
//
//					if (guguInputValue == x * y) {
//						System.out.println("정답입니다");
//						okScore++;
//					} else {
//						System.out.println("오답입니다!  정답은 " + x * y + " 입니다");
//						noSocre++;
//					}
//
//				} // while
//
//			} // inputValue ==1
//			else if (inputValue == 2) {
//				System.out.println("현재까지 맞춘 정답 개수 : " + okScore);
//				System.out.println("현재까지 틀린 오답 개수 : " + noSocre);
//			} else if (inputValue == 3) {
//				System.out.println("종료되었습니다");
//				break;
//			}
//
//		}
//	}// 대형while문
//}
