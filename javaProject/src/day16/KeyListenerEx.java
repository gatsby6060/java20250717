package day16;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyListenerEx extends JFrame {
	private JLabel[] keyMessage; // JLabel로 만든 객채들로 만든 배열

	public KeyListenerEx() {
		setTitle("keyListener 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout()); // 왼쪽에서 오른쪽 정렬방식

		c.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				int keyCode = e.getKeyCode(); //자바에서 정의한 가상키값 내가 뭘 눌렀는지 확인...
				char keyChar = e.getKeyChar(); //문자가 가진 유니코드값을 알려줌
				keyMessage[0].setText(Integer.toString(keyCode));
				keyMessage[1].setText(Character.toString(keyChar));//없으면 ㅁ 나옴
				keyMessage[2].setText(e.getKeyText(keyCode));
			}
		});

		keyMessage = new JLabel[3];
		keyMessage[0] = new JLabel(" getKeyCode() ");
		keyMessage[1] = new JLabel(" getKeyChar() ");
		keyMessage[2] = new JLabel(" getKeyText() ");

		for (int i = 0; i < keyMessage.length; i++) {
			c.add(keyMessage[i]); // 컨테이너에 부착시킴
			keyMessage[i].setOpaque(true); // 배경 색 보이게 해주는것
			keyMessage[i].setBackground(Color.YELLOW);// 라밸 배경색 엘로
		}

		setSize(300, 150);
		setVisible(true);
		c.setFocusable(true); // 없으면 키보드가 인식 못함
		c.requestFocus();// 없으면 키보드가 인식 못함
	};

	public static void main(String[] args) {
		new KeyListenerEx();
	}
}
