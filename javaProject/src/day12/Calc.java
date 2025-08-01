package day12;

public interface Calc {
	public int add(int a, int b); // 인터페이스 안이라 추상메소드임 abrac 없어도

	public int subtract(int a, int b); // public도 없어도 되긴함 상속 할꺼라...

	public double average(int[] a); // 설계만 해놓은것임
	// 인터페이스 자체가설계회 구현을 나눌려는 의도...
}
