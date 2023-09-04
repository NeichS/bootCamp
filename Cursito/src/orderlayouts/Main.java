package orderlayouts;

import javax.swing.*;
import java.awt.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800 );
        frame.setLayout(new GridLayout(3,2));
        frame.setVisible(true);

        JPanel panelOne = new JPanel();
        JPanel panelTwo = new JPanel();
        JPanel panelThree = new JPanel();
        JPanel panelFour = new JPanel();
        JPanel panelFive = new JPanel();

        panelOne.setBackground(Color.red);
        panelTwo.setBackground(Color.blue);
        panelThree.setBackground(Color.green);
        panelFour.setBackground(Color.yellow);
        panelFive.setBackground(Color.PINK);

        panelOne.setPreferredSize(new Dimension(100,100));
        panelTwo.setPreferredSize(new Dimension(100,100));
        panelThree.setPreferredSize(new Dimension(100,100));
        panelFour.setPreferredSize(new Dimension(100,100));
        panelFive.setPreferredSize(new Dimension(100,100));

        frame.add(panelOne, BorderLayout.NORTH);
        frame.add(panelTwo, BorderLayout.SOUTH);
        frame.add(panelThree, BorderLayout.WEST);
        frame.add(panelFour, BorderLayout.EAST);
        frame.add(panelFive, BorderLayout.CENTER);





    }
}
