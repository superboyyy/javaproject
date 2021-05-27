package removetext;

import java.io.*;
import java.util.*;

public class RemoveText {
    public static void main(String[] args) throws Exception {
//         Check command line parameter usage
        if (args.length != 2) {
            System.out.println("Usage: java RemoveText stringToBeRemoved sourceFile");
            System.exit(1);
        }

        // Check if the file exists
        File sourceFile = new File(args[1]);
        if (!sourceFile.exists()) {
            System.out.println("Source file " + args[1] + " not exist");
            System.exit(2);
        }

        // Read text from the file and save it in a string builder
        Scanner input = new Scanner(sourceFile);
        StringBuilder sb = new StringBuilder();

        while (input.hasNext()) {
            String nl = input.nextLine();
            sb.append(nl.replaceAll(args[0], "") + '\n');
        }

        input.close();

        // Write back to the file
        try (PrintWriter output = new PrintWriter(sourceFile);) {
            output.println(sb.toString());

        }
    }
}
