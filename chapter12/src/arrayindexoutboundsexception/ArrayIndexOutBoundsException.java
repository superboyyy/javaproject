package arrayindexoutboundsexception;

import java.util.*;

public class ArrayIndexOutBoundsException {
    public static void main(String[] args) {
        int[] random = new int[100];
        for (int i = 0; i < random.length; i++) {
            int r = (int)(Math.random() * 100);
            random[i] = r;
        }

        System.out.println("Enter the number of index: ");
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        try {
            System.out.println("The number is "+ random[i]);
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Out of Bounds!");
            System.exit(1);
        }

    }
}
