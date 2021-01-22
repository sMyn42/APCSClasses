package base.complex;

public class Complex {

    private double a;
    private double b;

    public Complex (double real, double imaginary) {
        a = real;
        b = imaginary;
    }

    public Complex (double real){
        this(real, 0.0);
    }



}
