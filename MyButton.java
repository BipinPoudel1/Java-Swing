//We will practice
/*
 * To create a button
 * Methods like
 * setFont()
 * setText()
 * setForeground()
 * setBackground()
 * setCursor()
 * setEnabled()
 * setVisible()and 
 * how to use image in a butto (JButton)
 */

import javax.swing.*;
import java.awt.*;
public class MyButton {
      public static void main(String[] args) {
            JFrame frame= new JFrame();
            frame.setBounds(152, 20, 611, 688);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            Container c= frame.getContentPane();
            c.setLayout(null);

            JButton btn= new JButton("Click Here");
            btn.setSize(141, 58);
            btn.setLocation(440, 546);
            c.add(btn);

            Font font= new Font("Gill Sans Nova Light", Font.CENTER_BASELINE, 20);
            btn.setFont(font);

            //Another way to set text on the button
            btn.setText("Click Me");

            //To change foreground and background colors
            btn.setForeground(Color.getHSBColor(44, 50, 35));
            btn.setBackground(Color.getHSBColor(162, 199, 144));

            //To change the mouse cursor
            Cursor cur= new Cursor(Cursor.E_RESIZE_CURSOR);
            btn.setCursor(cur);

            //To make the button disabled/ enabled
            btn.setEnabled(true);

            //To use image as a button
            ImageIcon icon= new ImageIcon("../Images/random.jpg");

            JButton btn2= new JButton(icon);
            btn2.setLocation(15, 546);
            btn2.setSize(141, 58);
            //btn.setSize(icon.getIconWidth(), icon.getIconHeight()) to make the button size same as the image
            
            btn2.setVisible(true);
            c.add(btn2);

            frame.setVisible(true);
      }
}
