package day8;

public class Car {

	private String brand;
	private String model;
	private int year;

	Car(String carBrandNm, String carNm, int carYear) {
		// TODO Auto-generated constructor stub
		this.brand = carBrandNm;
		this.model = carNm;
		this.year = carYear;
	}

	void startEngine() {
		// TODO Auto-generated method stub
		System.out.println(this.brand + " " + this.model + "의 엔진을 시동합니다.");
	}

	void showInfo() {
		// TODO Auto-generated method stub
		System.out.print("차량 정보 : " + this.year + "년식 " + this.brand + " " + this.model );
		System.out.println("");
	}

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public int getYear() {
		return year;
	}

	
}
