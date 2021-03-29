package primefactors;

import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer x (x > 0) : ");
        int x = in.nextInt();
        StackOfIntegers stackOfIntegers = new StackOfIntegers(x);

        System.out.print("All the prime factors of the "+integer+ " are :");
        System.out.print(Arrays.toString(i));
    }

    public boolean isPrime(int x) {
        for (int i = 2; i <= x / 2; i++) {
            if (x % i == 0) {
                return false;
                break;
            }
            else
                return true;
        }
    }

}
