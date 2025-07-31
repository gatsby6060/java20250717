package Quiz;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class quiz4 {


//4. 구구단을 출력하시오. 
//단, 5단과 8단은 제외하고 출력
	public static void main(String[] args) {
		for (int i = 2; i <= 9; i++) {
			if (i == 5 || i == 8) {
				continue;
			}
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
		}
	}
}

