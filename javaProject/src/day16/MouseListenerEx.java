package day16;

import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseListenerEx extends JFrame {
	private JLabel la = new JLabel("Hello"); // 자바 라벨 //html 레이블

	public MouseListenerEx() {
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로그램 종료
		Container c = getContentPane(); // 도화지역할 컴포넌트를 붙일 역할 부분
		c.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				int x = e.getX();
				int y = e.getY();
				la.setLocation(x, y);
			}
		}); // addMouseListener

		c.setLayout(null); // 배치관리자를 무엇을 쓸것인가... FlowLayout(왼쪽에서 오른쪽)등등... null은 좌표로 하겠다.
		la.setSize(50, 20); // 컴포넌트를 글씨? 여유?카파? 크기를 50 20하겟다.
		la.setLocation(30, 30); // 위치를 x30 y30 놓겠따
		c.add(la); // 컨테이너에 컴포넌트를 넣겠다.
		setSize(250, 250); // 보이는 사이즈를 250 250으로...
		setVisible(true); // 보이겠다.
	}

	public static void main(String[] args) {

		new MouseListenerEx();
	}

}
