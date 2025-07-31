package review_day3;

public class Fruit {
	private String name;
	private String color;
	private int price;

	public Fruit() {
	};

	public Fruit(String name) {
	}

	public void sell() {
		System.out.println(name + "를 판매했습니다.");
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) { //값을 안 준다는 뜻 int 10이런거(뭔가 값이 아닌 것을 돌려주긴 하는듯)
		String status = "M";
		if(status.equals("M")) {
			System.out.println("수정 권한이 없습니다.");
			return; //void라도 쓰일 수 있음 더이상 실행안하고 빠져나가겠다.
		}
		
		if (price <= 0) {
			System.out.println("가격을 다시 확인해주세요.");
			return; //void라도 쓰일 수 있음 더이상 실행안하고 빠져나가겠다.
		}

		this.price = price;
	}

}
