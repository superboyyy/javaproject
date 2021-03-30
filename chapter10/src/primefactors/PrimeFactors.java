package primefactors;

import java.util.Scanner;
import java.util.Arrays;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer x (x > 0) : ");
        int x = in.nextInt();
        StackOfIntegers stackOfIntegers = new StackOfIntegers(x);

        System.out.print("All the prime factors of the "+ x + " are :");

        int initialnum = 2;
        while (initialnum <= x) {
            if (x % initialnum == 0) {
                x /= initialnum;
                stackOfIntegers.push(initialnum);
            }
            else
                initialnum++;
        }

        while (!stackOfIntegers.empty()) {
            System.out.print(stackOfIntegers.pop() + " ");
        }
    }





}
