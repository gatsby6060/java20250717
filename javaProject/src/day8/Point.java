package day8;

public class Point {
	private int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

//[1번] Point를 상속받아 색을 가진 점을 나타내는 ColorPoint 클래스를 작성하라. 다음 main() 메소드를 포함하고 실행 결과와 같이 출력되게 하라.
//
//public static void main(String[] args) {
//   ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
//   cp.setXY(10, 20);
//   cp.setColor("RED");
//   String str = cp.toString();
//   System.out.println(str+"입니다. ");
//}
//결과 : RED색의 (10,20)의 점입니다. 
//
//[2번] Point를 상속받아 색을 가진 점을 나타내는 ColorPoint 클래스를 작성하라. 다음 main() 메소드를 포함하고 실행 결과와 같이 출력되게 하라.
//
//public static void main(String[] args) {
//   ColorPoint zeroPoint = new ColorPoint(); // (0,0) 위치의 BLACK 색 점
//   System.out.println(zeroPoint.toString() + "입니다.");
//   ColorPoint cp = new ColorPoint(10, 10); // (10,10) 위치의 BLACK 색 점
//   cp.setXY(5,5);
//   cp.setColor("RED");
//   System.out.println(cp.toString()+"입니다.");
//}
//결과 : BLACK색의 (0,0) 점입니다.
//	RED색의 (5,5) 점입니다.
//	
//[3번] Point를 상속받아 3차원의 점을 나타내는 Point3D 클래스를 작성하라. 다음 main() 메소드를 포함하고 실행 결과와 같이 출력되게 하라.
//
//public static void main(String[] args) {
//   Point3D p = new Point3D(1,2,3); // 1,2,3은 각각 x, y, z축의 값.
//   System.out.println(p.toString()+"입니다.");
//   p.moveUp(); // z 축으로 위쪽 이동
//   System.out.println(p.toString()+"입니다.");
//   p.moveDown(); // z 축으로 아래쪽 이동
//   p.move(10, 10); // x, y 축으로 이동
//   System.out.println(p.toString()+"입니다.");
//   p.move(100,  200, 300); // x, y, z축으로 이동
//   System.out.println(p.toString()+"입니다.");
//}
//(1,2,3) 의 점입니다.
//(1,2,4) 의 점입니다.
//(10,10,3) 의 점입니다.
//(100,200,300) 의 점입니다.
//
//[4번] Point를 상속받아 양수의 공간에서만 점을 나타내는 PositivePoint 클래스를 작성하라. 다음 main() 메소드를 포함하고 실행 결과와 같이 출력되게 하라.
//
//public static void main(String[] args) {
//   PositivePoint p = new PositivePoint();
//   p.move(10, 10);
//   System.out.println(p.toString()+"입니다.");
//   p.move(-5,5); // 객체 p는 음수 공간으로 이동되지 않음
//   System.out.println(p.toString()+"입니다.");
//   PositivePoint p2 = new PositivePoint(-10, -10);
//   System.out.println(p2.toString()+"입니다.");
//}
//(10,10)의 점입니다.
//(10,10)의 점입니다.
//(0,0)의 점입니다.
