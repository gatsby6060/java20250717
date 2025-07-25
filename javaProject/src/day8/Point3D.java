package day8;

public class Point3D extends Point {
	private int z;

	Point3D(int i, int j, int z) {
		// TODO Auto-generated constructor stub
		super(i, j);
		this.z = z;
	}

	@Override
	public String toString() {
		return "(" + super.getX() + "," + getY() + "," + z + ")의 점";
	}
//(1,2,3) 의 점

	public void moveUp() {
		// TODO Auto-generated method stub
//		z = z + 1;
		z++;
	}

	public void moveDown() {
		// TODO Auto-generated method stub
		this.z--;
	}

	//오버로딩 // 부모클래스의 같은 함수에서 파라미터만 다르게 들어옴
	void move(int x, int y, int z) {
		super.move(x, y);
		this.z = z;
	}

}
