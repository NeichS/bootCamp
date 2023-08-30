package GUI;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame() {
        this.setTitle("POLENTAAAA");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //it makes the application close when the window is closed
        this.setSize(1280,720);
        this.setResizable(false);
        this.setVisible(true); //make the frame visible
        ImageIcon logo = new ImageIcon("AWS.png");
        this.setIconImage(logo.getImage()); //set the image as the logo
        this.getContentPane().setBackground(new Color(100,40,1)); //max value 255 para hexadecimal escribi 0x000000
    }



}
