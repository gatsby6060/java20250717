package day7;

public class ReviewMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit_Review1 apple = new Fruit_Review1("사과",1000);
//		apple.price = 999999; private이라서 접근 불가능
//		System.out.println(apple.price);
		
		System.out.println(apple.getPrice());
		
		apple.setPrice(2000);
		System.out.println(apple.getPrice());
		
	}

}
