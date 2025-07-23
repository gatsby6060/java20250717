package day6;

import java.util.Arrays;

public class ValueAndRefMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = a;
		b = b + 3;
//		System.out.println(a);

		int arr[] = { 1, 2, 3, 4, 5 }; // arr=> [I@378fd1ac
		System.out.println(arr);
		int copyArr[] = arr; // arr=> [I@378fd1ac copyArr => [I@378fd1ac
		copyArr[2] = 10000; // [I@378fd1ac 주소에 있는 2번째 인덱스에 값을 10000

		// arr, copyArr은 같은 주소를 공유하고 있기 때문에
		// [1, 2, 10000, 4, 5]
		System.out.println(Arrays.toString(arr));
	}

}
