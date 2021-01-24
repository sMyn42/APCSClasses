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

    public Complex multiply (Complex other) {
        return new Complex(this.a * other.a - this.b * other.b, this.a * other.b + this.b * other.a);
    }

    public static void main (String[] args) {
        Complex num1 = new Complex (3.0, 4.0);
        Complex num2 = new Complex (-6.0, 6.0);
        Complex num3 = new Complex (4.0, -3.0);
        Complex num4 = new Complex (-1.0);
        Complex num5 = new Complex (0.0, 0.5);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num1.abs());
        System.out.println(num2.abs());
        System.out.println(num3.abs());
        System.out.println(num4.abs());
        System.out.println(num5.abs());
        System.out.println(num1.add(num2));
        System.out.println(num1.add(num3));
        System.out.println(num3.add(num5));
        System.out.println(num3.multiply(num4));
        System.out.println(num3.multiply(num2));
        System.out.println(num1.multiply(num1));
    }

}
