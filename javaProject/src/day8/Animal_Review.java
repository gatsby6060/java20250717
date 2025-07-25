package day8;

public class Animal_Review {
	private String name;
	private int age;
	
	Animal_Review(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void eat() {
		System.out.println("먹는다.");
	}
	
	void speak() {
		System.out.println("소리를 낸다.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
