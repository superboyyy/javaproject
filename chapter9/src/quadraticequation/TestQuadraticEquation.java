package quadraticequation;

import java.util.Scanner;

public class TestQuadraticEquation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a,b,c: ");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();

        QuadraticEquation root = new QuadraticEquation(a,b,c);

        if (root.getDiscriminant() > 0)
        {
            System.out.println("r1 = " + root.getRoot1() + ", r2 = " + root.getRoot2());
        }
        else if (root.getDiscriminant() == 0)
        {
            System.out.println("r1 = r2 = " + root.getRoot1());
        }
        else
            System.out.println("The equation has no roots.");
    }
}
