import java.awt.*;

import javax.swing.*;

class MyJLabel{
	public static void main(String[] args) {
		JFrame frame= new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 1000, 500);

		Container c= frame.getContentPane();
		c.setLayout(null);

		ImageIcon icon= new ImageIcon("../Images/R.jpg");
		JLabel label= new JLabel("Text", icon, JLabel.CENTER);
		label.setBounds(0, 100, 500, 100);
		c.add(label);
	}
}
