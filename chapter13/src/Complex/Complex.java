package Complex;

public class Complex implements Comparable<Complex>, Cloneable{
    private double a;
    private double b;

    protected Complex() {
        this.a = 0;
        this.b = 0;
    }

    protected Complex(double a) {
        this.a = a;
        this.b = 0;
    }

    protected Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public Complex add(Complex number2) {
        double newA = a + number2.getA();
        double newB = b + number2.getB();
        return new Complex(newA, newB);
    }

    public Complex subtract(Complex number2) {
        double newA = a - number2.getA();
        double newB = b - number2.getB();
        return new Complex(newA, newB);
    }

    public Complex multiply(Complex number2) {
        double newA = a * number2.getA() - b * number2.getB();
        double newB = b * number2.getA() + a * number2.getB();
        return new Complex(newA, newB);
    }

    public Complex divide(Complex number2) {
        double newA = (a * number2.getA() + b * number2.getB())
                / (Math.pow(number2.getA(), 2.0) + Math.pow(number2.getB(),
                2.0));
        double newB = (b * number2.getA() - a * number2.getB())
                / (Math.pow(number2.getA(), 2.0) + Math.pow(number2.getB(),
                2.0));
        return new Complex(newA, newB);
    }

    public double abs() {
        return Math.sqrt(a * a + b * b);
    }

    @Override
    public int compareTo(Complex i) {
        if (abs() > i.abs()) {
            return 1;
        }
        else if (abs() < i.abs()) {
            return -1;
        }
        else return 0;
    }

    @Override
    public String toString() {
        if (b != 0) {
            return a + " + " + b + "i";
        }
        else return a + "";
    }

    public Object clone() {
        try {
            return super.clone();
        }
        catch (CloneNotSupportedException ex) {
            return null;
        }
    }

    public double getRealPart() {
        return a;
    }

    public double getImaginaryPart() {
        return b;
    }
}
