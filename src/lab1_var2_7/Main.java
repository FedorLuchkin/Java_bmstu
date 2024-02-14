package lab1_var2_7;
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
        int greatestCommonDivisor = getGreatestCommonDivisor(arr[0], arr[1]);
        int leastCommonMultiple = arr[0] * arr[1] / greatestCommonDivisor;

        for (int i=2; i<n; i++) {
            greatestCommonDivisor = getGreatestCommonDivisor(greatestCommonDivisor, arr[i]);
            leastCommonMultiple = leastCommonMultiple * arr[i] / greatestCommonDivisor;
        }

        System.out.printf("Greatest Common Divisor = %d\n", greatestCommonDivisor);
        System.out.printf("Least Common Multiple = %d", leastCommonMultiple);
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        int res = 1;
        if (first < second) first += second - (second = first);

        while (res != 0) {
            res = second % first;
            second = first;
            first = res;
        }
        return second;
    }
}
