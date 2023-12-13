//Will learn ActionListener and its methods

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener{
      Container c;
      JButton btn;

      MyFrame(){
            c=this.getContentPane();
            c.setLayout(null);

            btn= new JButton("Click Here");
            btn.setBounds(478, 196, 131, 91);
            c.add(btn);
            btn.addActionListener(this);
      }

      public void actionPerformed(ActionEvent e){
            c.setBackground(Color.getHSBColor(79, 183, 133));
      }
}

public class MyButtonEventHandling {
      public static void main(String[] args) {
            MyFrame f= new MyFrame();
            f.setTitle("Button Event Handling- Action Demo");
            f.setSize(641, 547);
            f.setLocation(64, 70);
            f.setVisible(true);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      }
}
