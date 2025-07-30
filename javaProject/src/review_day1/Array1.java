package review_day1;

import java.util.Random;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String subjectArr[] = { "java", "oracle", "html", "javascript", "jsp" };
		int scoreArr[] = { 90, 85, 60, 95, 100 };

		for (int i = 0; i < subjectArr.length; i++) {
			System.out.print("과목명 : " + subjectArr[i] + ", ");
			System.out.println("점수 : " + scoreArr[i]);
		}

//		Object obj[] = {1,1.5,"홀길동", true, new Random()};

//		int arr[] = new int[3]; // {0,0,0}

		// 점수가 평균을 넘는 과목들을 출력
		// 결과 : 평균이 넘는 과목은 java javascript jsp입니다

		int sum = 0;
		int mid = 0;

		for (int score : scoreArr) {
			sum += score;
		}
		double avg = (double)sum / scoreArr.length;
//		System.out.println("평균은:" + avg);

		System.out.print("평균이 넘는 과목은");
		for (int i = 0; i < scoreArr.length; i++) {
			if (scoreArr[i] > avg) {
				System.out.print(subjectArr[i] + " ");
			}
		}
		System.out.println("입니다");
		
		String subStr = "";
		for(int i = 0; i<scoreArr.length; i++) {
			if(scoreArr[i]>avg) {
				subStr += subjectArr[i] + " ";
			}
		}
		System.out.println("평균이 넘는 과목은 " + subStr + "입니다");
	}

}
