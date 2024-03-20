package Data;

public class ComplexNum {
    private final double real;
    private final double imag;

    public ComplexNum(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public double getImag() {
        return imag;
    }

    @Override
    public String toString() {
        return imag < 0 ? real + " - " + Math.abs(imag) + "i" : real + " + " + imag + "i";
    }
}

