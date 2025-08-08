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

public class Quiz1_1 extends JFrame {
//	private JLabel la = new JLabel("Hello"); // 자바 라벨 //html 레이블
		
	private JButton but = new JButton("1번버튼"); // 자바 라벨 //html 레이블
	private JButton but2 = new JButton("2번버튼"); // 자바 라벨 //html 레이블
	private JButton but3 = new JButton("3번버튼"); // 자바 라벨 //html 레이블
	private JButton but4 = new JButton("4번버튼"); // 자바 라벨 //html 레이블
	private JButton but5 = new JButton("5번버튼"); // 자바 라벨 //html 레이블
	private JButton but6 = new JButton("6번버튼"); // 자바 라벨 //html 레이블
	private JButton but7 = new JButton("7번버튼"); // 자바 라벨 //html 레이블
	private JButton but8 = new JButton("8번버튼"); // 자바 라벨 //html 레이블
	private JButton but9 = new JButton("9번버튼"); // 자바 라벨 //html 레이블
	private JButton but10 = new JButton("10번버튼"); // 자바 라벨 //html 레이블
	
	
	public Quiz1_1() {
		setTitle("Quiz1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
//		c.addMouseListener(new MyMouseListener());
		
		c.setLayout(new FlowLayout()); // 배치관리자를 무엇을 쓸것인가... FlowLayout(왼쪽에서 오른쪽)등등... null은 좌표로 하겠다.
//		but.setSize(60, 30); // 컴포넌트를 글씨? 여유?카파? 크기를 50 20하겟다.
//		but.setLocation(30, 30); // 위치를 x30 y30 놓겠따

		c.add(but); // 컨테이너에 컴포넌트를 넣겠다.
		c.add(but2);
		c.add(but3);
		c.add(but4);
		c.add(but5);
		c.add(but6);
		c.add(but7);
		c.add(but8);
		c.add(but9);
		c.add(but10);

		setSize(500, 250); // 보이는 사이즈를 250 250으로...
		setVisible(true); // 보이겠다.
		
		
		
		but.addActionListener(new ActionListener() {
			Random ran = new Random();
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("버튼 클릭되었음!");
				JButton eventBtn = (JButton) e.getSource();
					eventBtn.setBackground(new Color(ran.nextInt(256),ran.nextInt(256),ran.nextInt(256)));
			}
		});
		
		but2.addActionListener(new ActionListener() {
			Random ran = new Random();
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("버튼 클릭되었음!");
				JButton eventBtn = (JButton) e.getSource();
					eventBtn.setBackground(new Color(ran.nextInt(256),ran.nextInt(256),ran.nextInt(256)));
			}
		});
		but3.addActionListener(new ActionListener() {
			Random ran = new Random();
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("버튼 클릭되었음!");
				JButton eventBtn = (JButton) e.getSource();
					eventBtn.setBackground(new Color(ran.nextInt(256),ran.nextInt(256),ran.nextInt(256)));
			}
		});
		but4.addActionListener(new ActionListener() {
			Random ran = new Random();
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("버튼 클릭되었음!");
				JButton eventBtn = (JButton) e.getSource();
					eventBtn.setBackground(new Color(ran.nextInt(256),ran.nextInt(256),ran.nextInt(256)));
			}
		});
		but5.addActionListener(new ActionListener() {
			Random ran = new Random();
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("버튼 클릭되었음!");
				JButton eventBtn = (JButton) e.getSource();
					eventBtn.setBackground(new Color(ran.nextInt(256),ran.nextInt(256),ran.nextInt(256)));
			}
		});
		but6.addActionListener(new ActionListener() {
			Random ran = new Random();
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("버튼 클릭되었음!");
				JButton eventBtn = (JButton) e.getSource();
					eventBtn.setBackground(new Color(ran.nextInt(256),ran.nextInt(256),ran.nextInt(256)));
			}
		});
		but7.addActionListener(new ActionListener() {
			Random ran = new Random();
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("버튼 클릭되었음!");
				JButton eventBtn = (JButton) e.getSource();
					eventBtn.setBackground(new Color(ran.nextInt(256),ran.nextInt(256),ran.nextInt(256)));
			}
		});
		but8.addActionListener(new ActionListener() {
			Random ran = new Random();
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("버튼 클릭되었음!");
				JButton eventBtn = (JButton) e.getSource();
					eventBtn.setBackground(new Color(ran.nextInt(256),ran.nextInt(256),ran.nextInt(256)));
			}
		});
		but9.addActionListener(new ActionListener() {
			Random ran = new Random();
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("버튼 클릭되었음!");
				JButton eventBtn = (JButton) e.getSource();
					eventBtn.setBackground(new Color(ran.nextInt(256),ran.nextInt(256),ran.nextInt(256)));
			}
		});
		but10.addActionListener(new ActionListener() {
			Random ran = new Random();
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("버튼 클릭되었음!");
				JButton eventBtn = (JButton) e.getSource();
					eventBtn.setBackground(new Color(ran.nextInt(256),ran.nextInt(256),ran.nextInt(256)));
			}
		});
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Quiz1_1();
	}

}
