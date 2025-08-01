package day12;

public class TV implements PowerControl {

	String name;
	public TV(String name) {
		this.name = name;
	}
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println(name +" 전원 켜짐");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println(name + " 전원 꺼짐");
	}

}
