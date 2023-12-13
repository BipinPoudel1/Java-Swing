//Learn setEchoChar() method and how to hide/ show password
import java.awt.*;
import javax.swing.*;

public class MyPasswordField {
      public static void main(String[] args) {
            JFrame frame= new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setBounds(163, 20, 705, 618);

            Container c= frame.getContentPane();
            c.setLayout(null);

            JPasswordField pass= new JPasswordField();
            pass.setBounds(400, 271, 200, 17);
            c.add(pass);

            Font font= new Font("Gill Sans Nova Light",Font.PLAIN , 10);
            pass.setFont(font);

            //To show the characters in the password field
            pass.setEchoChar('*');

            //To make the default password visible
            pass.setEchoChar((char)0);

            frame.setVisible(true);
      }
}
