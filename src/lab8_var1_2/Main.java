package lab8_var1_2;

public class Main {
    private static Object lock = new Object();
    private static boolean finished = false;

    public static void main(String[] args) {
        Thread leftLegThread = new Thread(() -> {
            synchronized (lock) {
                for (int i = 0; i < 5; i++) {
                    System.out.println("LEFT");
                    lock.notify();
                    try {
                        if (i < 4) {
                            lock.wait();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                finished = true;
                lock.notify(); // Для завершения работы
            }
        });

        Thread rightLegThread = new Thread(() -> {
            synchronized (lock) {
                while (!finished) {
                    System.out.println("RIGHT");
                    lock.notify();
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                lock.notify(); // Для завершения работы
            }
        });

        leftLegThread.start();
        rightLegThread.start();

        try {
            leftLegThread.join();
            rightLegThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Robot has finished walking.");
    }
}