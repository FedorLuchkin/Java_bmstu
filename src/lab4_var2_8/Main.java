package lab4_var2_8;

public class Main {
    public static void main(String[] args) {
        Ship ship1 = new CargoShip();
        Ship ship2 = new Tanker();

        ship1.sail();
        ship2.sail();
    }
}
