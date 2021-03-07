package location;

public class Location {
    int row;
    int column;
    double maxValue;

    public static Location locateLargest(double[][] a) {
        Location location = new Location();
        location.maxValue = a[0][0];
        location.row = 0;
        location.column = 0;

        for (int row = 0; row < a.length; row++)
        {
            for (int column = 0; column < a[0].length; column++)
            {
                if (location.maxValue < a[row][column])
                {
                    location.maxValue = a[row][column];
                    location.row = row;
                    location.column = column;
                }
            }
        }
        return location;
    }
}
