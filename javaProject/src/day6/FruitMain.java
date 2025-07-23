package day6;

public class FruitMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit banana = new Fruit("바나나",1000);
		
		banana.setPrice(-2000); // 메소드로 접근하면 메소드 내에서 제어가 가능(가격 상향 하향 조건등...)
		                        // 간접적으로 제어하면 권한등을 확인할수 있는 장점이 있다.
		                        // 변수 자체를 private으로 설정하고 다른 클래스에서 들어와서 함부로 변경 못하게 함
		int price = banana.getPrice();
		System.out.println(price);
		
		
		
	}

}
