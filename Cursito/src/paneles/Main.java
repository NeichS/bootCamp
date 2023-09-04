package paneles;

import javax.swing.*;
import java.awt.*;


public class Main {
    public static void main(String[] args) {
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 200, 200);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(200, 0, 200, 200);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(0, 200, 400, 200);

        JLabel label = new JLabel("Hola como andas?");
        label.setForeground(Color.CYAN);
        ImageIcon image = new ImageIcon("cleveland.png");
        label.setIcon(image);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); //indica tipo de layout que va a utilizar el frame
        frame.setSize(750, 750);
        frame.setVisible(true);
        redPanel.add(label);
        frame.add(redPanel);
        frame.add(greenPanel);
        frame.add(bluePanel);
    }
}
