public class Fecha {
    private int day,month,year;

    //DD/MM/YYYY 01/34/6789
    public void setDate(String date) {
        this.day = Integer.parseInt(date.substring(0, 2));
        this.month = Integer.parseInt(date.substring(3, 5));
        this.year = Integer.parseInt(date.substring(6, 10));
    }

    @Override
    public String toString() {
        return day + "/" + month + "/" + year;
    }
}
