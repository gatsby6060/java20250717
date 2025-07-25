package day8;

public class ColorPoint extends Point {

	private String color;

	public ColorPoint() {
		this(0, 0, "BLACK");
//		this.color = "Black";
	}

	public ColorPoint(int x, int y) {
		this(x, y, "BLACK");
		// TODO Auto-generated constructor stub
	}

	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
		// TODO Auto-generated constructor stub
	}

	void setXY(int x, int y) {
		// TODO Auto-generated method stub
		super.move(x, y);
	}

	void setColor(String color) {
		// TODO Auto-generated method stub
		this.color = color;
	}

	@Override
	public String toString() {
		return color + "색의 " + "(" + super.getX() + "," + super.getY() + ")의 점";
	}

}
