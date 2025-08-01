package day12;

public abstract class Calculator { // 추상메소드가 잇으면 추상클래스로 해야한다
	 public abstract int add(int a, int b); //{}불가능 추상메소드는
	 public abstract int subtract(int a, int b);
	 public abstract double average(int[] a);
}
