//Event Handling using Anonymous Inner Class

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class ButtonEventHandling {
      public static void main(String[] args) {
            JFrame f= new JFrame();
            f.setBounds(87, 88, 666, 274);
            f.setVisible(true);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            Container c= f.getContentPane();
            c.setLayout(null);

            JButton btn= new JButton("Click Here");
            btn.setBounds(179, 46, 165, 95);
            c.add(btn);

            btn.addActionListener(new ActionListener(){
                  public void actionPerformed(ActionEvent e){
                        c.setBackground(Color.RED);
                  }
            });
      }
}
