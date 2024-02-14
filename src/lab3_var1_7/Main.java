package lab3_var1_7;

import java.util.Random;


public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        /*Fraction first = new Fraction();
        Fraction second = new Fraction(1, 2);
        operationsDemonstration(first, second);

        first.setN(4);
        second.setM(3);
        second.setN(8);
        operationsDemonstration(first, second);

        first.setM(5);
        first.setN(6);
        second.setM(6);
        second.setN(7);
        operationsDemonstration(first, second);
        System.out.println("TASK:");*/

        int arrSize = random.nextInt(9) + 2;
        Fraction[] fractions = new Fraction[arrSize];

        System.out.println("Source array:");
        for (int i = 0; i < arrSize; i++) {
            int n = random.nextInt(8) + 2;
            int m = random.nextInt(n) + 1;
            fractions[i] = new Fraction(m, n);
            fractions[i].print();
        }

        System.out.println("\nResult array:");
        for (Fraction fraction : taskMethod(fractions)) {
            fraction.print();
        }

    }

    private static Fraction[] taskMethod(Fraction[] fractions) {
        for (int i = 0; i < fractions.length; i++) {
            if ((i % 2 == 0) && (i < fractions.length - 1)) {
                fractions[i] = Fraction.add(fractions[i], fractions[i+1]);
            }
        }
        return fractions;
    }

    private static void operationsDemonstration(Fraction first, Fraction second) {
        Fraction fractionSum = Fraction.add(first, second);
        Fraction fractionDiff = Fraction.subtract(first, second);
        Fraction fractionMultiple = Fraction.multiply(first, second);
        Fraction fractionQuotient = Fraction.divide(first, second);
        System.out.printf("First fraction: %d/%d\n", first.getM(), first.getN());
        System.out.printf("Second fraction: %d/%d\n", second.getM(), second.getN());
        System.out.printf("Sum fraction: %d/%d\n", fractionSum.getM(), fractionSum.getN());
        System.out.printf("Diff fraction: %d/%d\n", fractionDiff.getM(), fractionDiff.getN());
        System.out.printf("Multiple fraction: %d/%d\n",
                fractionMultiple.getM(), fractionMultiple.getN());
        System.out.printf("Quotient of fractions: %d/%d\n--------------------\n",
                fractionQuotient.getM(), fractionQuotient.getN());
    }
}
