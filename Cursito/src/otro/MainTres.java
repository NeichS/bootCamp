package otro;

public class MainTres {
    public static void main(String[] args) {

        String[][] cars = {     {"Marca", "Chasis", "ID"},
                                {"Ferrari", "SF23", "0"},
                                {"RedBull", "RB19","1"}
                            };

        for (String[] car : cars) {
            for (String autito : car) {
                System.out.print(autito + " ");
            }
            System.out.println();
        }

    }
}
