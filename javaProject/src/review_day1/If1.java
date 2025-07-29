package review_day1;

public class If1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
//		if (a > 10) {
//			System.out.println("a는 10보다 크다");
//		} else {
//			System.out.println("a는 10보다 작거나 같다.");
//		}

		if (a > 10) {
			System.out.println("a는 10보다 크다");
		} else if (a>=7) {
			System.out.println("a는 7보다 크거나 같다");
		} else if (a>=5) {
			System.out.println("a는 5보다 작거나 같다.");
		} else {
			System.out.println("a는 5보다 작다.");
		}


	}

}
