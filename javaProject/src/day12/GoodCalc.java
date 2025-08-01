package day12;

import review_day2.*; //패키지의 모든 클래스 가져오기

public class GoodCalc extends Calculator { //추상클래스를 상속받아서 구현함

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int subtract(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double average(int[] a) {
		// TODO Auto-generated method stub
		return ArrayFunc.avg(a);
	}

	
	
}
