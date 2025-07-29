package review_day1;

import java.util.Random;

public class Loop_While2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 랜덤한 숫자(1~100)을 지속적으로 출력하는데
		// 단, 50을 만나면 아래 테스트 출력 후 종료
		// '50을 출력 후 종료되었습니다.'
		Random ran = new Random();
		
		int count = 0;
		while(true) {
			int ranNum = ran.nextInt(100)+1;
			count++;
			if(ranNum == 50) {
				System.out.println(count+"번만에 50을 출력 후 종료되었습니다.");
				break;
			}
			System.out.println(ranNum);
		}
		
		System.out.println("통과");
	}

}
