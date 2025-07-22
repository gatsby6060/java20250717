package day5;

public class HumanMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human hong = new Human();
		hong.name = "홍길동";
		hong.eat();
		System.out.println(hong.name);
		
		Human kim = new Human();
		kim.name = "김철수";
		kim.study();
		System.out.println(kim.name);
		
	}

}
