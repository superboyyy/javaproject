package geometricobject;

public class Test {
    public static void main(String[] args) {
        Circle circle1 = new Circle(1);
        GeometricObject circle2 = new Circle(2);

        Circle circle = (Circle) Circle.max(circle1,circle2);
        System.out.println("The larger circle's radius is " + circle.getRadius());
        System.out.println(circle);
    }


}
