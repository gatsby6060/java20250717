package day16test;

import java.util.Random;
import java.util.Scanner;

import javax.net.ssl.SSLContext;


//문항3]  3. 구구단 문제를 랜덤으로 생성하여 출력하고 사용자로부터 답을 입력 받으시오. (20점)
//조건 1. 사용자로부터 몇문제를 풀지 입력 받은 후 해당 수 만큼 문제를 출력한다.
//단, 문제 수는 최소 3, 최대 10문제로 제한한다.
//조건 2. 모든 문제를 풀이한 후 맞은 개수가 더 많을 경우 '통과 입니다' 출력 후 종료한다.
//조건 3. 틀린 개수가 더 많거나 맞은 개수와 동일할 경우 '재도전 하시겠습니까? 출력 후
//'네'를 입력하면 조건 1부터 다시 시작, 그 외의 값을 입력하면 종료한다.
//조건 4. 위에서 정의한 문구외의 다른 문구는 자유롭게 정의한다.
public class Quiz3 {

	public static void main(String[] args) {



		while (true) {
			System.out.print("몇 문제를 풀지 입력하세요 : ");
			Scanner s = new Scanner(System.in);
			Random ran = new Random();
			int QuizCount = s.nextInt();
			int correctCount = 0;
			int inCorrectCount = 0;
			
			
			correctCount = 0;
			inCorrectCount = 0;
			if (QuizCount < 3 || QuizCount > 10) {
				System.out.print("문제는 최소 3 최대 10문제로 제한함. 다시 입력하세요 몇 문제 풀까요? : ");
				QuizCount = s.nextInt();
			} else {
				

				for (int i = 0; i < QuizCount; i++) {

					int x = ran.nextInt(8) + 2;
					int y = ran.nextInt(9) + 1;

					System.out.print(x + " * " + y + " = ");
					int inputNm = s.nextInt();
					if (x * y == inputNm) {
						correctCount++;
					} else {
						inCorrectCount++;
					}

				} // for


			} //else
			
			if (correctCount > inCorrectCount) {
				System.out.println("통과입니다.");
				break;
			} else {
				System.out.print ("틀린 개수가 더 많거나 맞은 개수와 동일합니다 '재도전 하시겠습니까? ");
				String userInputStr = s.next();
				if(userInputStr.equals("네")) {
					continue;
				}else {
					System.out.println(" \"네\" 이외에는 자동종료");
					break;
				}
			}//if else
			
		
		} // while

	}
}
