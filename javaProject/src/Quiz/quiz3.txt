package quiz;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class quiz3 {


//3. 스캐너를 통해 숫자를 하나 입력받고, 해당 숫자의 구구단을 역순으로 출력하시오.
//(ex, 2입력시 2*9=18, 2*8=16, 2*7=14 ... 2*1=2 출력)
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int inputValue = s.nextInt();

		for (int i = 9; i >= 1; i--) {
			System.out.print(inputValue + "*");
			System.out.print(i);
			System.out.println("=" + inputValue * i);
		}
	}
}
