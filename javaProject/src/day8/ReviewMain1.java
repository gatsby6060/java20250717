package day8;

public class ReviewMain1 {

	static void varParameter(int age, String name) {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}

	static void objParameter(Animal_Review animal) {
		System.out.println("이름 : " + animal.getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Animal_Review cat = new Animal_Review("고양이", 3); cat.eat(); cat.speak(); //
		 * cat.walk(); // 자식 클래스 메소드는 부모 클래스가 호출 X
		 * 
		 * Dog_Review dog = new Dog_Review("강아지", 5, "푸들"); dog.eat(); dog.speak();
		 * dog.walk();
		 */
		// ==================================== //
		int a = 20;
//		String b = "홍길동";
		String b = new String("홍길동");

		varParameter(a, b);
		
		Animal_Review cat = new Animal_Review("고양이",3);
		objParameter(cat);
		
		Dog_Review dog = new Dog_Review("강아지", 5, "푸들");
		Animal_Review dog2 = dog;
		objParameter(dog);
	}

}
