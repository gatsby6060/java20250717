package day8;

public class PositivePoint extends Point {

	public PositivePoint() {
		// TODO Auto-generated constructor stub
		// 일단 만듬 만들자 마자 0 0 으로 좌표 설정
		super(0, 0);
	}

	public PositivePoint(int x, int y) {
		// TODO Auto-generated constructor stub
		super(x, y);
		if (x < 0 || y < 0) {
			super.move(0, 0);
		}
	}

	@Override
	protected void move(int x, int y) {
		// TODO Auto-generated method stub
		if (x >= 0 && y >= 0) {
			super.move(x, y);
		}

	}

	@Override
	public String toString() {
		return "(" + super.getX() + "," + super.getY() + ")의 점";

	}
}
