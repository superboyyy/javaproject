package geometricobject;

public class Triangle extends GeometricObject {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;
    
    /** Construct a default triangle. */
    Triangle() {
        double side1 = this.side1;
        double side2 = this.side2;
        double side3 = this.side3;
    }

    /** Construct a triangle with the specified side1, side2, and side3. */
    Triangle(double side1, double side2, double side3) {
        side1 = this.side1;
        side2 = this.side2;
        side3 = this.side3;
    }

    /** Construct accessor methods for all three data fields. */
    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    /** Construct a method that returns the area of this triangle. */
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        s = Math.sqrt(s);
        return s;
    }

    /** Construct a method that returns the Perimeter of this triangle. */
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    /** Construct a method that returns a string description for the triangle. */
    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }
}
