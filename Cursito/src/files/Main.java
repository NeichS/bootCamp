package files;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("secret_message.txt");

        if (file.exists()) {
            System.out.println("File exists");
            System.out.println(file.getPath());
            System.out.println(file.isFile());
            file.delete();
        } else {
            System.out.println("File does not exist");
        }
    }
}
