package review_day1;

public class Loop_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for(int i=0; i<=10; i++)
		int i = 1;

		while (i <= 5) {
			int j = 1;
			while (j <= 5) {
				System.out.print("(" + i + "," + j + ") ");
				j++;
			}
			i++;
			System.out.println();

		}

//		System.out.println("-------------------------------------");
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= 5; j++) {
//				System.out.print("(" + i + "," + j + ") ");
//			}
//			System.out.println();
//		}

	}

}
