package lab8_var1_1;

import java.util.Random;

public class Main {
    private int balance;
    private static boolean finished = false;

    public Main(int initialBalance) {
        this.balance = initialBalance;
    }

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Пополнение на сумму " + amount + " рублей. Текущий баланс: " + balance + " рублей");
    }

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Снятие на сумму " + amount + " рублей. Текущий баланс: " + balance + " рублей");
        } else {
            System.out.println("Недостаточно средств для снятия " + amount + " рублей");
        }
    }

    public static void main(String[] args) {
        Main account = new Main(1000);

        Thread depositThread = new Thread(() -> {
            Random rand = new Random();
            synchronized (account) {
                for (int i = 0; i < 5; i++) {
                    int amount = rand.nextInt(501); // случайная сумма от 0 до 500
                    account.deposit(amount);
                    account.notify();
                    try {
                        account.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                finished = true;
                account.notify(); // Для завершения работы
            }
        });

        Thread withdrawThread = new Thread(() -> {
            Random rand = new Random();
            synchronized (account) {
                while (!finished) {

                    int amount = rand.nextInt(1501); // случайная сумма от 0 до 500
                    account.withdraw(amount);
                    account.notify();
                    try {
                        account.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                account.notify();
            }
        });

        depositThread.start();
        withdrawThread.start();

        try {
            depositThread.join();
            withdrawThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Operations were stopped.");

    }
}