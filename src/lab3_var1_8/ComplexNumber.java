package lab3_var1_8;


public class ComplexNumber {
    private double re;
    private double im;

    public ComplexNumber() {
        this.re = 1;
        this.im = 0;
    }
    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
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
        double operationRe = first.getRe() * second.getRe() - first.getIm() * second.getIm();
        double operationIm = first.getRe() * second.getIm() + first.getIm() * second.getRe();
        return new ComplexNumber(operationRe, operationIm);
    }

    public static ComplexNumber divide(ComplexNumber first, ComplexNumber second) {
        double operationRe = (first.getRe() * second.getRe() +
                first.getIm() * second.getIm());
        double operationIm = (first.getIm() * second.getRe() -
                first.getRe() * second.getIm());
        double divisor = second.getRe() * second.getRe() +
                second.getIm() * second.getIm();

        return new ComplexNumber(operationRe / divisor, operationIm / divisor);
    }
}
