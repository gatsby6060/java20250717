package review_day1;

import java.util.Random;
import java.util.Scanner;

public class Loop_While3 {

	static Random ran = new Random();
	static Scanner s = new Scanner(System.in);
	static int totalQuizCount = 0;
	static int okQuizCount = 0;

	public static int[] randomGuGuDan(int num) {

		int count = 0;
		System.out.println(num + "문제 풀이를 시작합니다.");
		for (int i = 1; i <= num; i++) {
			int x = ran.nextInt(8) + 2; // 2~9
			int y = ran.nextInt(9) + 1; // 1~9
			System.out.print(x + " * " + y + " = ");
			int answer = s.nextInt();
			totalQuizCount++;
			if (answer == (x * y)) {
				System.out.println("정답입니다.");
				okQuizCount++;
				count++;
			} else {
				System.out.println("오답입니다. 정답은 " + (x * y) + "입니다.");
			}
		}
		int arr[] = { count, 3 - count, num }; // 첫번째값은 정답개수, 두번쨰 값은 오답개수 , 전체 문제수
		return arr;
	}

	public static void gameUpAndDown() {
		// 1부터 30사이의 랜덤한 숫자 생성 후
		// 값을 입력받아서 몇번만에 맞추는지 출력해준 후 종료
		// 랜덤숫자가 입력값보다 더 클 경우 => 'UP'
		// 작을 경우 => 'DOWN'출력
		// 정답을 맞추면 '00번만에 맞추셨습니다.' 출력

		Random ran = new Random();
		int ranNum = ran.nextInt(30) + 1;

		Scanner s = new Scanner(System.in);
		System.out.println("Up&Down 게임 시작");
		int count = 0;
		for (;;) { // 무한루프
			System.out.println((count + 1) + " 정답 입력 : ");
			int answer = s.nextInt();
			count++;
			if (ranNum == answer) {
				System.out.println(count + "번만에 맞췄습니다.");
				break;
			} else if (ranNum > answer) {
				System.out.println("Up");
			} else {
				System.out.println("Down");
			}
		}
	}

	public static void main(String[] args) {

		// 메뉴
		// 1을 선택하면 랜덤 구구단 문제 3문제 출제
		// 2를 선택하면 up&down 게임
		// 1~2이외의 값을 선택하면 종료
		int correctCount = 0; // 정답개수
		int inCorrectCount = 0; // 오답개수
		int count = 0; // 전체 문제 수

		while (true) {
			System.out.println("=== 메뉴를 선택해 주세요 ===");
			System.out.print("[ (1) 랜덤 구구단 (2) Up&Down (3)구구단 성적 조회 (그외) 종료 ] : ");

			int menu = s.nextInt();
			if (menu == 1) {
				System.out.print("풀이하고자 하는 문제 수를 입력해주세요 : ");
				int num = s.nextInt();
				int arr[] = randomGuGuDan(num);
				correctCount += arr[0];
				inCorrectCount += arr[1];
				count += arr[2];
			} else if (menu == 2) {
				// Up&Down
				gameUpAndDown();
			} else if (menu == 3) {
				System.out.println(count + "문제 중" + correctCount + " 개 맞추셨습니다.");

			} else {
				// 종료
				break;
			}

		}

	}

	public static void score() {
		// TODO Auto-generated method stub
		System.out.println("총 " + totalQuizCount + " 중 " + okQuizCount + "문제를 맞추셨습니다.");
	}
}
