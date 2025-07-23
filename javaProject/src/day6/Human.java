package day6;

public class Human {
	// 생성자에서 this()의 활용
	// 생성자에서 this()메소드는 다른 생성자를 호출하는데 사용
	// this()는 생성자의 첫줄에 있어야한다.
	
	// 필드 영역
	private String name;
	int age;
	double height;
	
	
	// 생성자 영역
	Human(String name, int age, double height){
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	Human(String name, int age){
		this(name, age, 0.0); // 다른 생성자호출 파라미터3개호출 
	}
	
	Human(String name){
		this(name, 0, 0.0);
	}

	
}
