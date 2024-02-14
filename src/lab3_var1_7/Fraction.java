package lab3_var1_7;

import static lab1_var2_7.Main.getGreatestCommonDivisor;

public class Fraction {
    private int m;
    private int n;

    public Fraction() {
        this.m = 1;
        this.n = 1;
    }
    public Fraction(int m, int n) {
        this.m = m;
        this.n = n;
    }

    public int getM() {
        return this.m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getN() {
        return this.n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void print() {
        System.out.printf("%d/%d ", m, n);
    }

    public static Fraction add(Fraction first, Fraction second) {
        int denominator = first.getN() * second.getN();
        int numerator = first.getM() * second.getN() + first.getN() * second.getM();
        return signFix(numerator, denominator);
    }

    public static Fraction subtract(Fraction first, Fraction second) {
        int denominator = first.getN() * second.getN();
        int numerator = first.getM() * second.getN() - first.getN() * second.getM();
        return signFix(numerator, denominator);
    }

    public static Fraction multiply(Fraction first, Fraction second) {
        int numerator = first.getM() * second.getM();
        int denominator = first.getN() * second.getN();
        return signFix(numerator, denominator);
    }

    public static Fraction divide(Fraction first, Fraction second) {
        int numerator = first.getM() * second.getN();
        int denominator = first.getN() * second.getM();
        return signFix(numerator, denominator);
    }

    private static Fraction signFix(int numerator, int denominator) {
        int commonDivisor = getGreatestCommonDivisor(numerator, denominator);
        numerator = numerator/ commonDivisor;
        denominator = denominator / commonDivisor;
        if (denominator < 0) {
            denominator = denominator * -1;
            numerator = numerator * -1;
        }
        return new Fraction(numerator, denominator);
    }
}

