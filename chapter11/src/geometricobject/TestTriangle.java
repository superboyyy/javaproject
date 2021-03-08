package geometricobject;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the three sides of the triangle: ");
        double side1 = in.nextDouble();
        double side2 = in.nextDouble();
        double side3 = in.nextDouble();

        System.out.println("Enter the color of the triangle: ");
        String color = in.nextLine();

        System.out.println("Whether the triangle is filled ( true / false ): ");
        boolean isFilled = in.nextBoolean();

        Triangle triangle = new Triangle(side1, side2, side3);

        triangle.setColor(color);

        triangle.setFilled(isFilled);

        System.out.println("The area of the triangle is " + triangle.getArea());
        System.out.println("The perimeter of the triangle is " + triangle.getPerimeter());
        System.out.println("The boolean of isFilled is " + triangle.isFilled());
    }
}
