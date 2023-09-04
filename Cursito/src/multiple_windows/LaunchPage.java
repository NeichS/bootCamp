package multiple_windows;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LaunchPage implements ActionListener {

    JButton button1 = new JButton("Button 1");
    JFrame frame = new JFrame();
    LaunchPage() {
        button1.setBounds(0,0, 200, 50);
        button1.setFocusable(false);
        button1.addActionListener(this);
        frame.add(button1);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 700);
        frame.setLayout(null);
        frame.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button1) {
            frame.dispose();
            NewWindow window = new NewWindow();
        }
    }
}
