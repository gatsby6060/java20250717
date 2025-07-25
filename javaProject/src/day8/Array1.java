package day8;

import java.util.Arrays;

public class Array1 {
	public static void main(String[] args) {
		// 2차원 배열
		int arr[] = new int[3];	// {0,0,0}
		int arr2[][] = new int[3][2];
//		  {
//		   {0,0},
//		   {0,0},
//		   {0,0}
//		  }
		int arr3[][] = {{1,2},{3,4},{5,6}};
		System.out.println(Arrays.toString(arr3[1]));
		System.out.println(arr3[1].length);
		System.out.println(arr3[2][1]); //6   0번째 1번째 2번째 로 생각해본다.
		System.out.println(arr3[1][0]);
		
	}
}
