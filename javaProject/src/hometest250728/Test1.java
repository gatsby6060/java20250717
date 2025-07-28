package hometest250728;

import java.util.Scanner;

//사용자로부터 정수를 입력받아 3의 배수인지, 5의 배수인지, 둘 다인지 판별하여 출력하시오.
//(예: 15 입력 시 "3과 5의 공배수", 9 입력 시 "3의 배수", 10 입력 시 "5의 배수")
//

//사용자로부터 정수를 입력받아 1부터 해당 숫자까지의 합을 출력하시오.
//(예: 5 → 1+2+3+4+5 = 15)
//

//Scanner를 통해 정수를 하나 입력받고 해당 숫자의 팩토리얼을 출력하시오.
//(예: 5 → 5! = 120)
//
//Scanner를 통해 나이를 입력받고, 미성년자(18세 미만)인지 아닌지 판별하시오.
//
//18세 이상이면 "성인입니다", 그렇지 않으면 "미성년자입니다" 출력
//
//정수형 배열 {4, 9, 1, 6, 13, 2} 에서 홀수만 출력하시오.
//
//정수형 배열 {3, 5, 7, 2, 8, 1} 에서 가장 작은 수와 가장 큰 수를 찾아 출력하시오.
//
//크기 10의 정수 배열을 선언하고, 1부터 100까지의 난수를 넣은 후 짝수만 출력하시오.
//// 클래스 문제
//
//조건 1. 클래스명 : Book
//조건 2. 필드(변수)
// - title (제목, String)
// - author (저자, String)
// - publisher (출판사, String)
// - price (가격, int)
//
//조건 3. 생성자
//제목과 저자를 초기화하는 생성자
//제목, 저자, 출판사, 가격을 모두 초기화하는 생성자
//
//조건 4. 메소드
// - setPrice(int price)
//전달받은 가격으로 price 필드 값을 변경
//
// - getTitle()
//책 제목 반환
//
// - printInfo()
//형식: "도서명: ooo / 저자: ooo / 출판사: ooo / 가격: ooo원" 출력
//
//조건 5. 메인 메소드에서 다음을 수행
//Book 객체 b1 생성 (제목: "자바의 정석", 저자: "남궁성")
//Book 객체 b2 생성 (제목: "이펙티브 자바", 저자: "조슈아 블로크", 출판사: "인사이트", 가격: 38000)
//b1의 가격을 25000으로 설정
//b2의 도서 제목을 출력
//b1의 정보 출력 (printInfo() 호출)
public class Test1 {

//	//사용자로부터 정수를 입력받아 3의 배수인지, 5의 배수인지, 둘 다인지 판별하여 출력하시오.
//	//(예: 15 입력 시 "3과 5의 공배수", 9 입력 시 "3의 배수", 10 입력 시 "5의 배수")
//	//
//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		System.out.println("숫자를 입력해 3의 배수인지 5의배수인지 확인해줄께");
//		int a = s.nextInt();
//		if(a%3==0&&a%5==0) {
//			System.out.println("3과 5의 공배수");
//		}else if(a%3==0) {
//			System.out.println("3의 배수 입니다.");
//		} else if(a%5==0){
//			System.out.println("5의 배수입니다.");
//		}
//	}

	
	
	
	// 사용자로부터 정수를 입력받아 1부터 해당 숫자까지의 합을 출력하시오.
	// (예: 5 → 1+2+3+4+5 = 15)
	//
//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		System.out.println("정수를 입력하면 1부터 해당숫자까지 합을 알려줄께요");
//		int a = s.nextInt();
//		int sum = 0;
//		for (int i = 1; i <= a; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
//	}
	
	
	
	//Scanner를 통해 정수를 하나 입력받고 해당 숫자의 팩토리얼을 출력하시오.
	//(예: 5 → 5! = 120)
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int muti = 1;
		for(int i = a; i>=1; i--) {
			muti = muti * i;
		}
		System.out.println(muti);
	}

}
