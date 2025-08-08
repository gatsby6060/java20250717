package day16;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Quiz1_2 extends JFrame {

	
	
	public Quiz1_2() {
		setTitle("Quiz1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout()); // 배치관리자를 무엇을 쓸것인가... FlowLayout(왼쪽에서 오른쪽)등등... null은 좌표로 하겠다.
		Random ran = new Random();
		for(int i=1; i<=10 ; i++) {
			JButton btn = new JButton(i+"번 버튼");
			btn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub           0~255
					btn.setBackground(new Color(ran.nextInt(256),ran.nextInt(256),ran.nextInt(256)));
				}
			});
			c.add(btn);
		}

		setSize(500, 200); // 보이는 사이즈를 250 250으로...
		setVisible(true); // 보이겠다.
		
		
		
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Quiz1_2();
	}

}
