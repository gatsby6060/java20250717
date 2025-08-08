package day16;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JFrame;

public class ClickAndDoubleClickEx extends JFrame {

	public ClickAndDoubleClickEx() {
		setTitle("Click and DoubleClick 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
//		c.addMouseListener(new MyMouseListener());
		Random ran = new Random();
		c.addMouseListener(new MouseAdapter() { 
			@Override
			public void mouseClicked(MouseEvent e) {  
				// TODO Auto-generated method stub    
				if (e.getClickCount() == 2) {   //더블클릭시 배경색 바꾸기
					c.setBackground(new Color(ran.nextInt(256), ran.nextInt(256), ran.nextInt(256)));
				}
			}

		});
		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ClickAndDoubleClickEx();
	}

}
