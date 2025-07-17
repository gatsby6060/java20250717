package day2;

public class Loop_For3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1부터 100까지의 홀수들의 합을 출력

		int oddsum = 0;
//		for (int i = 1; i <= 100; ++i) {
//			if (i % 2 == 1) {
////				sum = sum+i;
//				oddsum += i;
////				System.out.println(i);
//			}
//		}
		
		for (int i = 1; i <= 100; i+=2) {
			if (i % 2 == 1) {
//				sum = sum+i;
				oddsum += i;
//				System.out.println(i);
			}
		}
		System.out.println(oddsum);

	}

}
