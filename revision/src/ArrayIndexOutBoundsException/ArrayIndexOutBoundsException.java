package ArrayIndexOutBoundsException;

import java.util.Scanner;

public class ArrayIndexOutBoundsException {
    public static void main(String[] args) throws Exception{
        int[] test = new int[100];

        for (int i = 0; i < test.length; i++) {
            int a = (int)(Math.random() * 100);
            test[i] = a;
        }

        Scanner in = new Scanner(System.in);
        while(true) {
            System.out.println("Enter an index: ");
            int i = in.nextInt();

            try {
                System.out.println("The element value is " + test[i]);
            }
            catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("Out of Bounds!");
                System.exit(0);
            }
        }


    }
}
