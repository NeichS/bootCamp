package exceptions;
import java.util.*;

public class Main {
    public static void inputs() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to divide");

        int x = scanner.nextInt();

        System.out.println("Enter a number to divide by");
        int y = scanner.nextInt();

        System.out.println(x / y);

        scanner.close();
    }

    public static void main(String[] args) {

        try {
            inputs();
        } catch (ArithmeticException e) {
            System.out.println("Error, yo cant divide by zero");
        } catch (InputMismatchException e) {
            System.out.println("Enter numbers pls");
        } catch (Exception e) {
            System.out.println("Error");
        } finally {
            System.exit(0);
        }
    }
}
