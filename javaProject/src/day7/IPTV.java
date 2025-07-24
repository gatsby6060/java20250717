package day7;

public class IPTV extends ColorTV {

	String ip = "";

	public IPTV(String ip, int size, int colorNumber) {
		// TODO Auto-generated constructor stub
		super(size, colorNumber);
		this.ip = ip;
	}

	@Override
	public void printProperty() {
		System.out.print("결과 : 나의 IPTV는 " + ip +" 주소의 ");
		super.printProperty();
	}
}
