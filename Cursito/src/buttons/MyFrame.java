package buttons;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JLabel label;
    MyFrame(){
        button = new JButton();
        label = new JLabel();

        ImageIcon icon = new ImageIcon("cleveland.png");
        label.setIcon(icon);
        label.setBounds(100,50,800,800);
        label.setVisible(false);

        button.setBounds(0,0,100,50);
        button.addActionListener(this);
        button.setText("Soy boton");
        button.setFocusable(false); //elimina el borde ese feo del texto del boton
        /*button.setHorizontalTextPosition();
        button.setVerticalTextPosition();
        button.setHorizontalAlignment();
        button.setVerticalAlignment();
         */
        button.setBorderPainted(false);
        button.setBackground(Color.WHITE);
        button.setEnabled(true); //activa o desactiva el boton

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000,1000);
        this.setLayout(null);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button){  //se fija si el buton fue presionado
            label.setVisible(true);
        }
    }
}
