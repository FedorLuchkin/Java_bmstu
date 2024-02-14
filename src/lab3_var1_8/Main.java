package lab3_var1_8;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        /*ComplexNumber first = new ComplexNumber();
        ComplexNumber second = new ComplexNumber(1, 2);
        operationsDemonstration(first, second);

        first.setIm(4);
        second.setRe(3);
        second.setIm(8);
        operationsDemonstration(first, second);

        first.setRe(5);
        first.setIm(6);
        second.setRe(6);
        second.setIm(7);
        operationsDemonstration(first, second);*/
        //System.out.println("TASK:");

        int n = random.nextInt(9) + 2;
        ComplexNumber[] firstVector = new ComplexNumber[n];
        ComplexNumber[] secondVector = new ComplexNumber[n];

        System.out.println("Source vectors:");
        for (int i = 0; i < n; i++) {
            int re = random.nextInt(10) - random.nextInt(10);
            int im = random.nextInt(10) - random.nextInt(10);
            firstVector[i] = new ComplexNumber(re, im);

            re = random.nextInt(10) - random.nextInt(10);
            im = random.nextInt(10) - random.nextInt(10);
            secondVector[i] = new ComplexNumber(re, im);
        }
        for (ComplexNumber numbers : firstVector) {
            numbers.print();
            System.out.print(' ');
        }
        System.out.print('\n');
        for (ComplexNumber numbers : secondVector) {
            numbers.print();
            System.out.print(' ');
        }

        System.out.println("\nResult vector:");
        for (ComplexNumber numbers : taskMethod(firstVector, secondVector)) {
            numbers.print();
            System.out.print(' ');
        }
    }

    private static ComplexNumber[] taskMethod(ComplexNumber[] firstVector, ComplexNumber[] secondVector) {
        ComplexNumber[] resultVector = new ComplexNumber[firstVector.length];
        for (int i = 0; i < firstVector.length; i++) {
            resultVector[i] = ComplexNumber.add(firstVector[i], secondVector[i]);
        }
        return resultVector;
    }

    private static void operationsDemonstration(ComplexNumber first, ComplexNumber second) {
        ComplexNumber fractionSum = ComplexNumber.add(first, second);
        ComplexNumber fractionDiff = ComplexNumber.subtract(first, second);
        ComplexNumber fractionMultiple = ComplexNumber.multiply(first, second);
        ComplexNumber fractionQuotient = ComplexNumber.divide(first, second);
        System.out.printf("First number: (%.3f ; %.3f)\n", first.getRe(), first.getIm());
        System.out.printf("Second number: (%.3f ; %.3f)\n", second.getRe(), second.getIm());
        System.out.printf("Sum number: (%.3f ; %.3f)\n", fractionSum.getRe(), fractionSum.getIm());
        System.out.printf("Diff number: (%.3f ; %.3f)\n", fractionDiff.getRe(), fractionDiff.getIm());
        System.out.printf("Multiple number: (%.3f ; %.3f)\n",
                fractionMultiple.getRe(), fractionMultiple.getIm());
        System.out.printf("Quotient of numbers: (%.3f ; %.3f)\n--------------------\n",
                fractionQuotient.getRe(), fractionQuotient.getIm());
    }
}

