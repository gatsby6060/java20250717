package day12;

public class FoodMain {

	public static void foodBoxing(Food f) { // 이순간 업케스팅
		System.out.println(f.name + "를 포장했습니다.");
		int takeOutPrice = 0;
		if (f instanceof Pizza) { // 구분 가능 뭐가 업케스팅 됐는지
			takeOutPrice = 3000;
		} else if (f instanceof Burger) {
			takeOutPrice = 2000;
		} else if (f instanceof Salad) {
			takeOutPrice = 1000;
		}
		System.out.println(f.name + "는 포장비 "+ takeOutPrice + "원 입니다.");
	}

//	public static void pizzaBoxing(Pizza p) {
//		System.out.println(p.name + "를 포장했습니다.");
//		System.out.println("버거는 포장비 2000원 입니다.");
//	}
//	
//	public static void burgerBoxing(Burger b) {
//		System.out.println(b.name + "를 포장했습니다.");
//		System.out.println("버거는 포장비 2000원 입니다.");
//	}
//	
//	public static void saladBoxing(Salad s) {
//		System.out.println(s.name + "를 포장했습니다.");
//		System.out.println("샐러드는 포장비 1000원 입니다.");
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pizza pizza = new Pizza("불고기 피자");
		System.out.println(pizza); //pizza.toString();
//		Pizza pizza = new Pizza("피자");
//		foodBoxing(pizza);
//		Burger burger = new Burger("햄부기");
//		foodBoxing(burger);
//		Salad salad = new Salad("샐러드");
//		foodBoxing(salad);
		
		 
	}

}
