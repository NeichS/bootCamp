package otro;

import javax.swing.JOptionPane;
public class MainDos {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Ingrese su nombre");
        JOptionPane.showMessageDialog(null, "Welcome " + name);

    }
}
