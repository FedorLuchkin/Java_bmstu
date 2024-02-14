package lab3_var2_7;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import static java.lang.System.*;


public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(in);

        int n = random.nextInt(5) + 2;
        out.printf("Input info about %d users\n", n);
        Phone[] users = new Phone[n];

        for (int i = 0; i < n; i++) {
            int id = i + 1;
            out.printf("Input lastname for user №%d:\n", id);
            String lastname = scanner.nextLine();
            out.printf("Input firstname for user №%d:\n", id);
            String firstname = scanner.nextLine();
            out.printf("Input surname for user №%d:\n", id);
            String surname = scanner.nextLine();
            out.printf("Input address for user №%d:\n", id);
            String address = scanner.nextLine();

            int creditCard = id * 1000;
            int debit = random.nextInt(1000000);
            int credit = random.nextInt(1000000);
            int cityCallsMinutes = random.nextInt(30);
            int longDistanceCallsMinutes = random.nextInt(30) * (i % 3);

            users[i] = new Phone(id, lastname, firstname, surname,
                                 address, creditCard, debit, credit,
                                 cityCallsMinutes, longDistanceCallsMinutes);
        }
        out.println("Source array:");
        printAll(users);
        out.println("------------------\nSet limit for city calls:");
        int limit = scanner.nextInt();
        out.println("------------------\nExceeded the time limit:");
        exceedingCityCallsTime(limit, users);
        out.println("------------------\nLong distance calls usage:");
        longDistanceCallsUsage(users);
        out.println("------------------\nSorted by full name:");
        Arrays.sort(users);
        printAll(users);
    }

    private static void printAll(Phone[] users) {
        for (Phone user : users) {
            out.println(user);
        }
    }
    private static void exceedingCityCallsTime(int limit, Phone[] users) {
        int flag = 0;
        for (Phone user : users) {
            if (user.getCityCallsMinutes() > limit) {
                out.println(user);
                flag = 1;
            }
        }
        if (flag == 0) out.println("No one");
    }

    private static void longDistanceCallsUsage(Phone[] users) {
        int flag = 0;
        for (Phone user : users) {
            if (user.getLongDistanceCallsMinutes() > 0) {
                out.println(user);
                flag = 1;
            }
        }
        if (flag == 0) out.println("No one");
    }
}
