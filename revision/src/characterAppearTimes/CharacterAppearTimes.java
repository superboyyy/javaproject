package characterAppearTimes;

import java.io.File;
import java.util.Scanner;

public class CharacterAppearTimes {
    public static void main(String[] args) throws Exception{
        System.out.println("Enter a filename: ");
        Scanner in = new Scanner(System.in);
        File file = new File(in.nextLine());
        if (!file.exists()) {
            System.out.println("The file doesn't exist!");
            System.exit(1);
        }
        Scanner input = new Scanner(file);
        int[] counts = new int[26];

        while (input.hasNext()) {
            String s = input.nextLine();

            for (int i = 0; i < s.length(); i++) {
                if (Character.isUpperCase(s.charAt(i))) {
                    counts[(s.charAt(i)) - 'A']++;
                }
            }
        }
        for (int i = 0; i < counts.length; i++) {
            System.out.println("Number of " + (char)(i + 'A') + "s: " + counts[i]);
        }
    }
}
