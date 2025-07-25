package day8;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1. Car 클래스 및 Car클래스를 상속받은 ElectricCar 만들기
		// 아래 코드를 main 메소드 안에 넣고 오류가 나지 않도록, 주석에 있는 결과가 나오도록 수정
			Car sonata = new Car("현대", "쏘나타", 2022); // brand(String), model(String), year(int)
			sonata.startEngine(); // 결과 : 현대 쏘나타의 엔진을 시동합니다.
			sonata.showInfo(); // 결과 : 차량 정보 : 2022년식 현대 쏘나타
			
			ElectricCar ioniq = new ElectricCar("현대", "아이오닉5", 2023, 80); // 80은 batteryCapacity(int)
			ioniq.startEngine(); // 결과 : 현대 아이오닉5의 전기 모터를 시동합니다.
			ioniq.showInfo(); // 결과 : 차량 정보 : 2023년식 현대 아이오닉5 (배터리 용량: 80kWh)
			
			int battery = ioniq.getBatteryCapacity();
			System.out.println(battery + "kWh"); // 80kwh
	}

}
