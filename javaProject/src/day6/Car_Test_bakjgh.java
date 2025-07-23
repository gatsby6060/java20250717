package day6;

public class Car_Test_bakjgh {

	private String name; //(자동차 이름)
	private String color; //(색상)
	private int speed; //(속도)

	
	Car_Test_bakjgh(){
		name = "기본차";
		color = "하얀색";
	}
	
	Car_Test_bakjgh(String nm, String col, int spd ){
//		"소나타","파란색",0
		name = nm;
		color = col;
		speed = spd;
	}
	
	void carInfo() {

		speed = 0;	
		System.out.println("자동차의 이름은 " + name +", 색상은 "+ color +" 입니다.");
	}
	
	void setInfo(String nm, String col, int spd) {
		//"아반떼", "노란색", 0
		name = nm;
		color = col;
		speed = spd;
	}
	
	void speedUp(int number) {
		speed += number;
		if(speed >= 200) {
			System.out.println("200 이상의 속도는 불가합니다. 200으로 변경됩니다.");
			speed = 200;
		}
	}
	
	int getSpeed() {
		return speed;
	}
	
	int speedDown(int number) {
		int spdDown = speed-number;

		speed = spdDown;
		
		if(speed <= 0) {
			System.out.println("0 미만의 속도는 불가합니다. 0으로 변경됩니다.");
			speed = 0;
		}
		
		return spdDown;
	}
	
}
