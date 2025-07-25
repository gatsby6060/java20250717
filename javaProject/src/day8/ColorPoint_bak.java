package day8;

public class ColorPoint_bak extends Point {

	String color;
	
	public ColorPoint_bak() {
		color = "Black";
	}
	
	public ColorPoint_bak(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	public ColorPoint_bak(int x, int y, String color) {
		super(x, y);
		this.color = color;
		// TODO Auto-generated constructor stub
	}

	public void setXY(int x, int y) {
		// TODO Auto-generated method stub
		super.move(x, y);
	}

	public void setColor(String string) {
		// TODO Auto-generated method stub
		color = string;
	}

	@Override
	public String toString() {
		return color + "색의 " + "(" + super.getX() + "," + super.getY() + ")의 점";
	}
	


}
