package Complex;

import java.awt.color.CMMException;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first complex number: ");
        double a = in.nextDouble();
        double b = in.nextDouble();
        System.out.println("Enter the second complex number: ");
        double c = in.nextDouble();
        double d = in.nextDouble();

        Complex c1 = new Complex(a,b);
        Complex c2 = new Complex(c,d);

        System.out.println("(" + c1 + ")" + " + " + "(" + c2 + ")" + " = " + c1.add(c2));
        System.out.println("(" + c1 + ")" + " - " + "(" + c2 + ")" + " = " + c1.subtract(c2));
        System.out.println("(" + c1 + ")" + " * " + "(" + c2 + ")" + " = " + c1.multiply(c2));
        System.out.println("(" + c1 + ")" + " / " + "(" + c2 + ")" + " = " + c1.divide(c2));
        System.out.println("|" + c1 + "| = " + c1.abs());
    }
}
