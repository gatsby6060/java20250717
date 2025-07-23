package day6;

public class Human_Review {
	// 클래스 = 필드(변수) + 메소드
	// 클래스는 객체를 만드는 틀(도구) 이다.
	// 클래스는 실체화(구체화)되지 않은 상태. 직접 사용은 불가능
	// (나중에 static 개념을 배우면 부분적으로 직접 사용이 가능)
	
	// 필드 영역
	String name;
	int age;
	double height;
	
	// 생성자 영역
	Human_Review(String name, int age, double height){
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	//메소드 영역
	void intro() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
	}
	
	String getName() {
		System.out.println("이름 정보를 전달합니다.");
		return name;
	}
	
	int getAge() {
		System.out.println("나이 정보를 전달합니다.");
		return age;
	}
	
	
}
