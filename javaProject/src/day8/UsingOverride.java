package day8;

public class UsingOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape start, last, obj;
		// 링크드 리스트로 도형생성하여연결
		start = new Line(); // Line 객체연결
		last = start;
		obj = new Rect();
		last.next = obj; // Rect객체연결
		last = obj;
		obj = new Line(); // Line 객체연결
		last.next = obj;
		last = obj;
		obj = new Circle(); // Circle 객체연결
		last.next = obj;
		// 모든도형출력
		Shape p = start;
		while (p != null) {
			p.draw();
			p = p.next;
		}
	}

}
