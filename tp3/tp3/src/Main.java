import javax.swing.*;
import java.awt.*;
import java.text.ParseException;
import java.util.*;

public class Main {

    public static String askDate()  {
        return JOptionPane.showInputDialog("Enter a date in the following format DD/MM/YY");
    }
    public static void main(String[] args) {
        Fecha first_date = new Fecha();
        String date = askDate();

        try {
            first_date.setDate(date);
        } catch (Exception e) {
            System.out.println("INGRESA BIEN LA FECHA PIBE");
        }

        MyFrame frame = new MyFrame(date);
    }
}
