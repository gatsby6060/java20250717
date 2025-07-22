package day5;

public class Day_Review3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 3, 5, 1, 4, 2 };

		// 가장 작은 값 찾기
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			};
		}
		System.out.println("최소 값은 " + min);

	}

}
