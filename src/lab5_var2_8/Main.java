package lab5_var2_8;

import java.util.Calendar;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

import static java.lang.System.*;


public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(in);

        int n = random.nextInt(5) + 2;
        out.printf("Input info about %d cars\n", n);
        Car[] cars = new Car[n];

        for (int i = 0; i < n; i++) {
            int id = i + 1;
            out.printf("Input brand of car №%d:\n", id);
            String brand = scanner.nextLine();
            out.printf("Input model of car №%d:\n", id);
            String model = scanner.nextLine();
            out.printf("Input color of car №%d:\n", id);
            String color = scanner.nextLine();
            out.printf("Input regNum of car №%d:\n", id);
            String regNum = scanner.nextLine();

            int price = random.nextInt(3000000) + 1000000;
            int yearOfManufacture = random.nextInt(24) + 2000;

            cars[i] = new Car(id, brand, model, yearOfManufacture, color, price, regNum);
        }

        printAll(cars);
        out.println("------------------\nSet brand for filter №1:");
        String brand = scanner.nextLine();
        out.printf("------------------\nFiltered by brand '%s':\n", brand);
        brandFilter(brand, cars);
        out.println("------------------\nSet model for filter №2:");
        String model = scanner.nextLine();
        out.println("------------------\nSet count of years for filter №2:");
        int yearCount = scanner.nextInt();
        out.printf("------------------\nCars with model '%s' older than %d:\n", model, yearCount);
        oldModelFilter(model, yearCount, cars);
        out.println("------------------\nSet year of manufacture for filter №3:");
        int year = scanner.nextInt();
        out.println("------------------\nSet car price for filter №3:");
        double price = scanner.nextDouble();
        out.printf("------------------\nCars released in %d that more expensive than %.3f:\n", year, price);
        yearPriceFilter(year, price, cars);
    }

    private static void printAll(Car[] cars) {
        for (Car car : cars) {
            out.println(car);
        }
    }

    private static void brandFilter(String brand, Car[] cars) {
        int flag = 0;
        for (Car car : cars) {
            if (Objects.equals(car.getBrand(), brand)) {
                out.println(car);
                flag = 1;
            }
        }
        if (flag == 0) out.println("No one");
    }

    private static void oldModelFilter(String model, int yearCount, Car[] cars) {
        int flag = 0;
        for (Car car : cars) {
            if ((Objects.equals(car.getModel(), model)) &&
                    ((Calendar.getInstance().get(Calendar.YEAR) - car.getYearOfManufacture()) > yearCount)) {
                out.println(car);
                flag = 1;
            }
        }
        if (flag == 0) out.println("No one");
    }

    private static void yearPriceFilter(int year, double price, Car[] cars) {
        int flag = 0;
        for (Car car : cars) {
            if (Objects.equals(car.getYearOfManufacture(), year) &&
                    (car.getPrice() > price)) {
                out.println(car);
                flag = 1;
            }
        }
        if (flag == 0) out.println("No one");
    }
}

