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

    public double abs () {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    public Complex add (Complex other) {
        return new Complex(this.a + other.a, this.b + other.b);
    }

    public String toString () {
        return "" + a + " + " + b + "i";
    }

    public Complex multiply () {
        return new Complex(0.0);
    }

    public static void main (String[] args) {
        Complex num1 = new Complex (3.0, 4.0);
        System.out.println(num1.abs());

        Complex addend = new Complex (6.0, 6.0);
        System.out.println(num1.add(addend));
    }

}
