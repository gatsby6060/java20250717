package day16;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Quiz1 extends JFrame {
	
	public Quiz1() {
		setTitle("Action 이벤트 리스너 작성");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		
		JButton btn = new JButton("Action");
		c.add(btn);
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
//				System.out.println("버튼 클릭되었음!");
				JButton eventBtn = (JButton) e.getSource();
				System.out.println(eventBtn.getText());
				if (eventBtn.getText().equals("Action")) {
					eventBtn.setText("액션");
				} else {
					eventBtn.setText("Action");
				}
			}
		});
		
		
		
		JButton btn2 = new JButton("배경색 변경");
		c.add(btn2);
		Random ran = new Random();
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				c.setBackground(new Color(ran.nextInt(256), ran.nextInt(256), ran.nextInt(256)));
			}

		});


		
		setSize(350, 150);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new Quiz1();
	}
}
