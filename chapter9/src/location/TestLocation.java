package location;

import java.util.Scanner;

public class TestLocation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns in the array: ");
        int row = in.nextInt();
        int column = in.nextInt();

        double[][] array = new double[row][column];

        System.out.println("Enter the array: ");
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
                array[i][j] = in.nextDouble();
            }
        }

        Location result = Location.locateLargest(array);

        System.out.println("The location of the largest element is " + result.maxValue + " at " + "(" + result.row + ", " + result.column + ")");

    }
}
