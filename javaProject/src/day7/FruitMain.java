package day7;

public class FruitMain {

	public static void fruitBoxing(Fruit f, int num) {
		System.out.println(f + "를 " + num + "개 포장했습니다.");
	}
	
//	public static void appleBoxing(Apple apple, int num) {
//		System.out.println(apple.name + "를 " + num + "개 포장했습니다.");
//	}
//
//	public static void orangeBoxing(Orange orange, int num) {
//		System.out.println(orange.name + "를 " + num + "개 포장했습니다.");
//	}
//
//	public static void bananaBoxing(Banana banana, int num) {
//		System.out.println(banana.name + "를 " + num + "개 포장했습니다.");
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Apple apple = new Apple("사과", 1000);
		fruitBoxing(apple, 3);

		Orange orange = new Orange("오랜지", 1500);
		fruitBoxing(orange, 5);

		Banana banana = new Banana("바나나", 500);
		fruitBoxing(banana, 10);

		Fruit goldApple = new Apple("황금사과", 20000);
		Fruit jejuOrange = new Orange("제주오렌지", 5000);
		Fruit goldBanana =  banana; //레퍼런스 공유 = 주소 공유

	}
}
