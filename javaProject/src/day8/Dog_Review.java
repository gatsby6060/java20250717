package day8;

public class Dog_Review extends Animal_Review {

	String dogBreed;

	Dog_Review(String name, int age, String dogBreed) {
		super(name, age);
		this.dogBreed = dogBreed;
	}
	
	void walk() {	//산책
		System.out.println(dogBreed + "(이)가 산책한다.");
	}

	@Override
	void speak() {
		System.out.println(dogBreed + "(이)가 멍멍 짓는다.");
	}

}
