import javax.swing.*;
import java.awt.*;

public class MyFrame {
    MyFrame(String first_date) {
        JLabel dateLabel = new JLabel("The date is " + first_date);
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout()); //indica tipo de layout que va a utilizar el frame
        frame.setSize(100, 500);
        frame.add(dateLabel);
        frame.setVisible(true);
    }
}
