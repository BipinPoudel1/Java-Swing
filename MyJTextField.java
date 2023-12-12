//Some methods learnt in this program:
/*
 * setText()
 * setFont()
 * setBackground()
 * setForeground()
 * setEditable()
 * 
 */

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyJTextField {
      public static void main(String[] args) {
            JFrame frame= new JFrame();

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setBounds(100, 100, 1000, 500);
            Container c= frame.getContentPane();
            c.setLayout(null);

            //Creating a textfield
            JTextField t1= new JTextField();
            t1.setBounds(100, 50, 200, 30);
            c.add(t1);

            //To add some default value in the text-field
            t1.setText("Type Something...");

            //To change the attributes of font in the text field, we create an object from 'Font'
            Font font= new Font("Gill Sans Nova Light", Font.BOLD, 20);
            t1.setFont(font);

            //To change the text color
            t1.setForeground(Color.ORANGE);
            t1.setBackground(Color.GRAY);

            //To set the text box uneditable
            t1.setEditable(false);

            frame.setVisible(true);
      }
}
