package file_writers;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("poem.txt");
            writer.write("Your mom my first girl \n Como rompes las bolas pibe\n ");
            writer.append("Neich 2023");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
