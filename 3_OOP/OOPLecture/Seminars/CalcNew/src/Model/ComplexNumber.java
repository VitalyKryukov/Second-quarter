package Model;

public class ComplexNumber {
    private double realPart;
    private double imaginaryPart;

    public ComplexNumber(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    public ComplexNumber add(ComplexNumber other) {
        double real = this.realPart + other.getRealPart();
        double imaginary = this.imaginaryPart + other.getImaginaryPart();
        return new ComplexNumber(real, imaginary);
    }

    public ComplexNumber multiply(ComplexNumber other) {
        double real = (this.realPart * other.getRealPart()) - (this.imaginaryPart * other.getImaginaryPart());
        double imaginary = (this.realPart * other.getImaginaryPart()) + (this.imaginaryPart * other.getRealPart());
        return new ComplexNumber(real, imaginary);
    }

    public ComplexNumber divide(ComplexNumber other) {
        double divisor = Math.pow(other.getRealPart(), 2) + Math.pow(other.getImaginaryPart(), 2);
        double real = ((this.realPart * other.getRealPart()) + (this.imaginaryPart * other.getImaginaryPart())) / divisor;
        double imaginary = ((this.imaginaryPart * other.getRealPart()) - (this.realPart * other.getImaginaryPart())) / divisor;
        return new ComplexNumber(real, imaginary);
    }

    @Override
    public String toString() {
        return realPart + " + " + imaginaryPart + "i";
    }
}
