package lab5_var1_8;

public class ComplexNumber {
    private double re;
    private double im;

    public ComplexNumber() {
        this.setRe(1);
        this.setIm(0);
    }

    public ComplexNumber(double re, double im) {
        this.setRe(re);
        this.setIm(im);
    }

    public double getRe() {
        return this.re;
    }

    public void setRe(double re) {
        this.re = re;
    }

    public double getIm() {
        return this.im;
    }

    public void setIm(double im) {
        this.im = im;
    }

    public void setComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public void print() {
        System.out.printf("(%.3f ; %.3f)", re, im);
    }

    public static ComplexNumber add(ComplexNumber first, ComplexNumber second) {
        return new ComplexNumber(
                first.getRe() + second.getRe(),
                first.getIm() + second.getIm()
        );
    }

    public static ComplexNumber subtract(ComplexNumber first, ComplexNumber second) {
        return new ComplexNumber(
                first.getRe() - second.getRe(),
                first.getIm() - second.getIm()
        );
    }

    public static ComplexNumber multiply(ComplexNumber first, ComplexNumber second) {
        try {
            double operationRe = first.getRe() * second.getRe() - first.getIm() * second.getIm();
            double operationIm = first.getRe() * second.getIm() + first.getIm() * second.getRe();
            return new ComplexNumber(operationRe, operationIm);
        } catch (Exception e) {
            System.out.println("Error during multiplication: " + e.getMessage());
            return null;
        }
    }

    public static ComplexNumber divide(ComplexNumber first, ComplexNumber second) {
        try {
            double divisor = second.getRe() * second.getRe() + second.getIm() * second.getIm();
            if (divisor == 0) {
                throw new IllegalArgumentException("Division by zero is not allowed");
            }

            double operationRe = (first.getRe() * second.getRe() + first.getIm() * second.getIm()) / divisor;
            double operationIm = (first.getIm() * second.getRe() - first.getRe() * second.getIm()) / divisor;

            return new ComplexNumber(operationRe, operationIm);
        } catch (IllegalArgumentException e) {
            System.out.println("Error during division: " + e.getMessage());
            return null;
        }
    }
}
