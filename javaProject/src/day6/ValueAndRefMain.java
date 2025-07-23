package day6;

import java.util.Arrays;

public class ValueAndRefMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValueAndRef v = new ValueAndRef();
		int x = 10;
		v.valueTest(x);
		System.out.println(x); 
		
		
		
		int arr[] = {1,2,3,4,5};
		System.out.println(arr);
		v.refTest(arr); //I@49097b5d(배열은 주소를 보냄)
		System.out.println(Arrays.toString(arr)); //같은 주소를 바라보기에 수치가 변함
	}

}
