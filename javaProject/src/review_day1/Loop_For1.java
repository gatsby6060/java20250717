package review_day1;

import java.util.Random;

public class Loop_For1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();

//		for (int i = 1; i <= input; i++) {
//			System.out.println(i);
//			if (i % 2 == 0) {
//				System.out.println(i);
//			}
//		}

		// 100번동안 랜덤한 숫자를 갱신해가면서
		// 50이라는 숫자가 몇번쨍에 나오는지
		// 만약 100번안에 나오면 '00번쨰에 50을 찾았습니다.'
		// 그렇지 않으면 '100번안에 50이 나오지 않았습니다'
		//입력받은 값은 밖에서 정의하는것이 좋을듯....
		boolean flg = false;
		for (int i = 1; i <= 100; i++) {
			int ranNum = ran.nextInt(100) + 1; // 1~100 사이 랜덤한 숫자   i가 올라갈떄마다 랜덤하게 숫자가바뀜
			if (ranNum == 50) {
				System.out.println(i + "번째에 50을 찾았습니다");
				flg = true;
				break;
			}
		}
//		if (flg == false) {
		if (!flg) {
			System.out.println("100번안에 50이 나오지 않았습니다.");
		}

	}

}
