package day7;

public class Student extends Person{
	
	int stuNo;
	
	void study() {
		System.out.println("공부 한다.");
	}

	Student(String name, int age, String addr, double height, int stuNo) {
		super(name, age, addr, height);
		this.stuNo = stuNo;
		// TODO Auto-generated constructor stub
	}
	
	@Override  //함수 재정의(완전히 재정의도 가능)
	void eat() { 
		System.out.println(name + "이(가) 급식을 먹는다.");
//		super.eat(); // 이건 부모것 호출
	}

}
