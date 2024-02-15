package lab3_var4_8;

import java.util.Arrays;

import static java.lang.System.out;


public class Main {
    public static void main(String[] args) {
        Voyage firstVoyage = new Voyage(-1);
        Voyage secondVoyage = new Voyage(-1);
        Car firstCar = new Car(10);
        Car secondCar = new Car(9);
        Driver firstDriver = new Driver(firstVoyage, firstCar);
        Driver secondDriver = new Driver(secondVoyage, secondCar);

        out.println("Default drivers");
        out.println(firstDriver);
        out.println(secondDriver);

        out.println("\nDrivers after voyages");
        firstVoyage.setState(4);
        firstCar.setState(3);
        secondVoyage.setState(10);
        secondCar.setState(8);
        out.println(firstDriver);
        out.println(secondDriver);

        out.println("\nDrivers voyages results [voyage state, car state, 1(0) - car is broken(is fine)]");
        out.print(Arrays.toString(firstDriver.getVoyageResults())+"; ");
        out.print(Arrays.toString(secondDriver.getVoyageResults()));

        out.println("\n\nDrivers after inspection");
        inspectionAndRemovalFromWork(firstDriver);
        inspectionAndRemovalFromWork(secondDriver);
        out.println(firstDriver);
        out.println(secondDriver);
    }

    private static void inspectionAndRemovalFromWork(Driver driver) {
        if (driver.getVoyageResults()[2] == 1) {
            driver.setState("Off");
        } else driver.setState("On");
    }
}
