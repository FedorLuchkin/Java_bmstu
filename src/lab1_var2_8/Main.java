package lab1_var2_8;

import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Random random = new Random();

        int n = random.nextInt(5) + 2;
        int counter = 0;
        int[] arr = new int[n];
        String newValue;

        // INPUT
        System.out.printf("Input %d numbers\n", n);
        while (!Objects.equals(counter, n)) {
            newValue = inp.nextLine();
            try {
                arr[counter] = Integer.parseInt(newValue);
                counter++;
            } catch (NumberFormatException e) {
                System.out.println("IT'S NOT A INTEGER!");
            }
        }
        arr = Arrays.stream(arr).sorted().toArray();
        inp.close();

        // INPUT RESULT
        System.out.printf("Your entered numbers: %s\n", Arrays.toString(arr));

        // TASK
        int flag = 0;
        for (int i = 0; i < n; i++) {
            if (BigInteger.valueOf(arr[i]).isProbablePrime(1)) {
                if (flag == 0) {
                    System.out.print("Prime numbers:");
                    flag = 1;
                }
                System.out.printf(" %d", arr[i]);
            }
        }
        if (flag == 0) System.out.print("No prime numbers");
    }
}