package review_day1;

public class LooP_For2 {
	public static void main(String[] args) {

//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print("(" + i + "," + j + ") ");
//			}
//			System.out.println();
//		}

//		(5,1) (5,2) (5,3) (5,4) (5,5) 
//		(4,1) (4,2) (4,3) (4,4) 
//		(3,1) (3,2) (3,3) 
//		(2,1) (2,2) 
//		(1,1) 

		for (int i = 5; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("(" + i + "," + j + ") ");
			}
			System.out.println();
		}

		System.out.println("---------------------");
//		(5,1)                                     i가 5일때 j가 1
//		(4,1) (4,2)                               i가 4일때 j가 2
//		(3,1) (3,2) (3,3)                         i가 3일때 j가 3
//		(2,1) (2,2) (2,3) (2,4)                   i가 2일때 j가 4
//		(1,1) (1,2) (1,3) (1,4) (1,5)             i가 1일때 j가 5
		
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= (6-i); j++) {
				System.out.print("(" + i + "," + j + ") ");
			}
			System.out.println();
		}

	}
}
