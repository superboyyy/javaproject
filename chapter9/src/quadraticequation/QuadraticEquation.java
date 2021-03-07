package quadraticequation;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double A, double B, double C) {
        a = A;
        b = B;
        c = C;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        double r1;
        r1 = (-b + Math.pow(getDiscriminant(), 0.5)) / (2 * a);
        if (getDiscriminant() >= 0)
            return r1;
        return 0;
    }

    public double getRoot2() {
        double r2;
        r2 = (-b - Math.pow(getDiscriminant(), 0.5)) / (2 * a);
        if (getDiscriminant() >= 0)
            return r2;
        return 0;
    }
}
