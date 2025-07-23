package day6;

public class Fruit {
	private String name;
	private int price; // private은 클래스안에서만 사용가능함 이 밖에서는(직접)사용불가임 
	
	Fruit(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	void info() {
		System.out.println(name + "의 가격은 " + price + " 입니다.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
//	int getPrice() {
//		return price;
//	}
//	
//	void setPrice(int price) {
//		
//		if(price <= 0 || price >= 1000000){
//			System.out.println("가격을 다시 확인해보세요");
//		} else if(false) { // 권한 체크
//			System.out.println("권한이 없는 사용자입니다.");
//		}else {
//			this.price = price;
//		}		
//	}
	
}
