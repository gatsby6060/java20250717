package day7;

public class Worker extends Person {
	//따로 지정된게 없으면 자기의 생성자를 호출하기 전에 부모클래스의 기본 생성자를 호출한다.
	Worker(){
		System.out.println("Worker 생성자 실행");
	}
	Worker(String name, int age, String addr, double height){
		super(name, age, addr, height); // 이렇게 하면 Person의 기본생성자를 호출하지 않고 매개변수4개짜리를 호출한다.
		System.out.println("매개변수 4개짜리 Worker 생성자 실행");
	}
}
