package day5;

public class Person {// extends Object 가 생략되어 있음

	String name;
	int age;
	
	//기본생성자는 다른 생성자를 하나라도 만들면 자동생성되지 않는다.
	Person(){}
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "이름은 " + name + ", 나이는 " + age;
	}

}
