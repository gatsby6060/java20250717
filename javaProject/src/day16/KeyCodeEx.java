package day16;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyCodeEx extends JFrame {
	private JLabel la = new JLabel();
	public KeyCodeEx() {
		setTitle("Key Code 예제 : F1키:초록색, % 키 노란색");
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 Container c = getContentPane();
		 
		 
		 c.addKeyListener(new KeyAdapter() {
			 @Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				System.out.println("유니코드 값 ==> " + e.getKeyChar());
				System.out.println("가상키 값 ==> " + e.getKeyCode());//f2같은 것은 가상키값만 있으니 이거 사용
//				int value = e.getKeyCode();
				System.out.println("특수키 포함 값 ==>" + e.getKeyText(e.getKeyCode()));
				if(e.getKeyChar() =='%') {
					c.setBackground(Color.YELLOW);
				} else if(e.getKeyCode() == KeyEvent.VK_F1) {
					c.setBackground(Color.GREEN);
				} else if(e.getKeyCode() == KeyEvent.VK_DELETE) {
					c.setBackground(Color.BLUE);
				}
			 }
		 });
		 c.add(la);
		 setSize(300,150);
		 setVisible(true);
		 c.setFocusable(true);
		 c.requestFocus();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KeyCodeEx();
	}

}
