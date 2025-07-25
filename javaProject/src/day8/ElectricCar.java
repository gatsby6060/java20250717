package day8;

public class ElectricCar extends Car {

	private int batteryCapacity;
	
	ElectricCar(String carBrandNm, String carNm, int carYear , int batteryCapacity) {
		// TODO Auto-generated constructor stub
		super(carBrandNm, carNm, carYear);
		this.batteryCapacity = batteryCapacity;
	}
	
	int getBatteryCapacity() {
		// TODO Auto-generated method stub
		return this.batteryCapacity;
	}
	
	@Override
	void showInfo() {
		// TODO Auto-generated method stub
		super.showInfo();
		System.out.println("(배터리 용량:" + batteryCapacity +"kWh)");
	}

	@Override
	void startEngine() {
		// TODO Auto-generated method stub
		System.out.println(getBrand() + " " + getModel() + "의 전기모터를 시동합니다.");
	}

}
