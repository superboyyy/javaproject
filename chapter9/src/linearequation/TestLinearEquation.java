package linearequation;

import java.util.Scanner;

public class TestLinearEquation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the value of a,b,c,d,e,f.");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double d = in.nextDouble();
        double e = in.nextDouble();
        double f = in.nextDouble();

        LinearEquation linearEquation = new LinearEquation(a,b,c,d,e,f);

        if (linearEquation.isSolvable())
            System.out.println("x is " + linearEquation.getX() + " y is " + linearEquation.getY());
        else
            System.out.println("The equation has no solution.");
    }
}
