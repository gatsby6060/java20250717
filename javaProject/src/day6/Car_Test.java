package day6;

public class Car_Test {

	private String name; // (자동차 이름)
	private String color; // (색상)
	private int speed; // (속도)

	Car_Test() {
		this("기본차", "하얀책", 0); // 다른 생성자 호출
//		name = "기본차";
//		color = "하얀색";
//		speed = 0;
	}

	Car_Test(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
	}

	void carInfo() {
		speed = 0;
		System.out.println("자동차의 이름은 " + name + ", 색상은 " + color + " 입니다.");
	}

	void setInfo(String name, String color, int speed) {
		// "아반떼", "노란색", 0
		this.name = name;
		this.color = color;
		this.speed = speed;
	}

	void speedUp(int speed) {
		if(this.speed + speed > 200) {
			System.out.println("200 초과의 속도는 불가합니다. 200으로 변경됩니다.");
			this.speed = 200;
		}else {
			this.speed += speed;
		}
	}

	public int getSpeed() {
		
		return speed;
	}

	public void speedDown(int speed) {
		// TODO Auto-generated method stub
		if(this.speed - speed < 0) {
			speed = 0;
			System.out.println("0 미만의 속도는 불가합니다. 0으로 변경됩니다.");
		} else {
			this.speed -= speed;
		}
					
	}

}
