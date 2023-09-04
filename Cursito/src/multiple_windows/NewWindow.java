package multiple_windows;

import javax.swing.*;
public class NewWindow {

    JFrame frame = new JFrame();
    JLabel label = new JLabel("HOLAAAAA!!!");
    NewWindow() {
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 700);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
