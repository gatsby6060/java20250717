package day4;

public class Array8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// {2,4,5,3,1}
		// **
		// ****
		// *****
		// ***
		// *
		int arr[] = { 2, 4, 5, 3, 1 };

		for (int i = 0; i < arr.length; i++) {

			for (int j = 1; j <= arr[i]; j++) {
				System.out.print("*");
			}
			System.out.println("");
			
		}
	}

}
