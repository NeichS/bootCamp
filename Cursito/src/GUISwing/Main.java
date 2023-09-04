package GUISwing;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

public class Main {
    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("cleveland.png");
        Border border = BorderFactory.createLineBorder(Color.blue, 3);

        JLabel label = new JLabel();
        label.setText("Como va a ser un homenaje?");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); //posiciona el texto de manera relativa a la imagen
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.YELLOW); // color del texto
        label.setFont(new Font("Arial", Font.BOLD, 20)); //fuente del texto
        label.setIconTextGap(30); //margin de la imagen
        label.setBackground(new Color(0));
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); //posiciona el texto y la imagen dentro del label vecticalmente
        label.setHorizontalAlignment(JLabel.CENTER); //posiciona todo horizontalmente
        //label.setBounds(125, 125, 350, 350); //defino en donde va a ubicarse el label

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(600, 600);
        //frame.setLayout(null);
        //frame.setResizable(false);
        frame.setVisible(true);
        frame.add(label);
        frame.pack(); //es como el flexbox, lo que hace es ajustar el tamaño del frame para que el contenido se vea bien
    }


}
