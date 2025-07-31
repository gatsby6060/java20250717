package Quiz;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class quiz2 {


//2. 스캐너를 통해 숫자를 입력받은 후 
//홀수일 경우 "홀수", 짝수일 경우 "짝수"를 출력하시오.
//단, 0이하의 숫자나 11이상의 숫자일 경우 "계산할 수 없습니다." 를 출력하시오.
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int inputValue = s.nextInt();
		if(inputValue <= 0 || inputValue >= 11) {
			System.out.println("계산할 수 없습니다.");
		} else if(inputValue % 2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
	}
}

