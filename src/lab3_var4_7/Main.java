package lab3_var4_7;

import static java.lang.System.out;


public class Main {
    public static void main(String[] args) {

        int number = 666;
        double balance = 100;
        double debtForCalls = 50;
        Service[] services = new Service[3];
        services[0] = new Service("lol");
        services[1] = new Service("kek");
        services[2] = new Service("cheburek");

        out.println("Source User");
        User user = new User(number, balance, debtForCalls, services);
        out.println(user);

        out.println("\nChanged User");
        user.setNumber(777);
        user.serviceOff("kek");
        out.println(user);

        out.println("\nAfter two balance operations");
        user.checkBalance();
        out.println(user);
        user.checkBalance();
        out.println(user);
    }
}
