package day16;

import javax.swing.JFrame;

public class MyFrame extends JFrame {

	 public MyFrame() {
		 setTitle("300x300 스윙프레임만들기"); // 상단 텍스트
		 setSize(300,300); // 프레임크기300x300
		 setVisible(true); // 프레임출력
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MyFrame frame = new MyFrame(); //생성자호출하면서 위에 코드 실행
	}

}
