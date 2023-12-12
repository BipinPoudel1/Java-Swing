import java.awt.*;

import javax.swing.*;

public class Addition extends JFrame {
	private JTextField num1, num2, result;
	private JButton addButton;

	public Addition(){
		setTitle("Addition");
		setSize(800,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLocationRelativeTo(null);

		num1= new JTextField(10);
		num2= new JTextField(10);
		result= new JTextField(10);
		result.setEditable(false);

		addButton= new JButton("Add");

		//Creating layout using panels
		JPanel inputPanel= new JPanel(new FlowLayout());
		inputPanel.add(new JLabel("First Number~ "));
		inputPanel.add(num1);
		inputPanel.add(new JLabel("Second Number~ "));
		inputPanel.add(num2);

		JPanel buttoPanel= new JPanel(new FlowLayout());
		buttoPanel.add(addButton);

		JPanel resultPanel= new JPanel(new FlowLayout());
		resultPanel.add(new JLabel("Sum= "));
		resultPanel.add(result);

		//Set main content pane
		Container contentPane= getContentPane();
		contentPane.setLayout(new BorderLayout());
		contentPane.add(inputPanel, BorderLayout.NORTH);
		contentPane.add(buttoPanel, BorderLayout.CENTER);
		contentPane.add(resultPanel, BorderLayout.SOUTH);

		setResizable(false);

	}
	
public static void main(String[] args) {
		Addition calculation= new Addition();
		calculation.setVisible(true);
}
}
