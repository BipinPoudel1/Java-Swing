import java.awt.Color;
import java.awt.Container;

import javax.swing.*;

class FirstFrame{
	public static void main(String[] args) {
		//For the frame
		JFrame frame= new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// frame.setSize(700, 500);
		// frame.setLocation(100, 50);
		frame.setBounds(100, 100, 1000, 500);
		frame.setTitle("My First Ever Frame");


		//For Icon on the frame
		ImageIcon icon= new ImageIcon("../Images/OIP.jpg");
		frame.setIconImage(icon.getImage());

		//to change the background of the JFrame
		Container c=frame.getContentPane();
		Color color= new Color(78, 5, 56);
		c.setBackground(color);

		//To make the frame non- resizable
		frame.setResizable(false);
	}
}