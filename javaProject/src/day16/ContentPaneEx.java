package day16;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ContentPaneEx extends JFrame {

	public ContentPaneEx() {
		setTitle("ContentPane과JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
//		c.setBackground(Color.ORANGE);
//		c.setBackground(new Color(200,150,50));
		c.setBackground(Color.CYAN);
		//rgb
		c.setLayout(new FlowLayout());

		c.add(new JButton("OK"));
		c.add(new JButton("Cancel"));
		c.add(new JButton("Ignore"));
		c.add(new JButton("Cancel"));
		c.add(new JButton("Ignore"));
		c.add(new JButton("Cancel"));
		c.add(new JButton("Ignore"));
		c.add(new JButton("Cancel"));
		c.add(new JButton("Ignore"));
		c.add(new JButton("Cancel"));
		c.add(new JButton("Ignore"));
		

		setSize(300, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ContentPaneEx();
	}

}
