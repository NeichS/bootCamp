package audio_polenta;

import javax.sound.sampled.*;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        Scanner scanner = new Scanner(System.in);

        File file = new File("polenta.wav");
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);

        String response = "";
        while (!response.equals("Q")) {
            System.out.println("P = Play , Q = Quit, R = Reset ");
            System.out.println("Choose something");
            response = scanner.nextLine();
            response = response.toUpperCase();

            switch (response) {
                case "P":
                    clip.start();
                    break;
                case "Q":
                    clip.stop();
                    System.exit(0);
                case "R":
                    clip.setMicrosecondPosition(3500);
                    break;
                default: {
            }
                System.out.println("Invalid input");
            }
        }

    }
}
