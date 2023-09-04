package otro;

import javax.security.sasl.SaslClient;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cual es tu nombre?");
        String nombre = scanner.nextLine();
        System.out.println("Cual es tu edad?");
        int edad = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Comida favorita?");

        String comida = scanner.nextLine();

        System.out.println("Tu nombre es " + nombre + " y tu edad es " + edad + " y tu comida favorita es " + comida);

        ArrayList<String> food = new ArrayList<String>();

        food.add("pizza");
        food.add("hamburguer");
        food.add("empanada");

        for (String s : food) {
            System.out.println(s);
            System.out.println(s);
        }



    }
}
