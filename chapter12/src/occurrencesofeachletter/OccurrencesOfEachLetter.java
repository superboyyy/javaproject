package occurrencesofeachletter;

import java.util.*;
import java.io.*;

public class OccurrencesOfEachLetter{
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a filename: ");
        String filename = in.nextLine();
        File file = new File(filename);

        if (!file.exists()) {
            System.out.println("The file " + filename +" does not exist");
            System.exit(0);
        }

        Scanner input = new Scanner(file);
        int[] counts = new int[26];

        while (input.hasNext()) {
            String s = input.nextLine();

            for (int i = 0; i < s.length(); i++) {
                if (Character.isLetter(s.charAt(i)))
                    counts[Character.toUpperCase(s.charAt(i)) - 'A']++;
            }
        }

        for (int i = 0; i < counts.length; i++)
            System.out.println("Number of " + (char)(i + 'A') + "'s is " + counts[i]);

    }
}
