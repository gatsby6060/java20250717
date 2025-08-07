package day16;

import java.awt.Color;
import java.awt.Container;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NullContainerEx extends JFrame {

	public NullContainerEx() {
		setTitle("Null Container Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		JLabel la = new JLabel("Hello, Press Buttons!");
		la.setLocation(130, 50);
		la.setSize(200, 20);
		
		c.add(la);
		Random ran = new Random();
		for (int i = 1; i <= 9; i++) {
			JButton b = new JButton(Integer.toString(i)); // 버튼생성
			b.setLocation(i * 15, i * 15);
			b.setSize(50, 20);
//			b.setBackground(Color.orange);
//			int ranNum = ran.nextInt(256); //이러면 0부터 255까지 생김
//			System.out.println(ranNum);
			b.setBackground(new Color(ran.nextInt(256),ran.nextInt(256),ran.nextInt(256))); //이러면 0부터 255까지 생김
//			b.setBackground(new Color(i*2,i*10,i*i));
			c.add(b); // 버튼을컨텐트팬에부착
		}
		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new NullContainerEx();
	}
}
