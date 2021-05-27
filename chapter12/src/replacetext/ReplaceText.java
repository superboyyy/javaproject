package replacetext;

import java.io.*;
import java.util.*;

public class ReplaceText {
    public static void main(String[] args) throws Exception {
        //Check command line parameter usage
        if (args.length != 3) {
            System.out.println("Usage: java ReplaceText file oldString newString");
            System.exit(1);
        }

        //Check if file exists
        File file = new File(args[0]);
        if (!file.exists()) {
            System.out.println("File " + args[0] + " does not exist");
            System.exit(2);
        }

        Scanner in = new Scanner(file);

        String s = "";
        while (in.hasNext()) {
            String s1 = in.nextLine();
            String s2 = s1.replaceAll(args[1], args[2]);
            s += s2 + "\n";
        }
        PrintWriter txt = new PrintWriter(file);
        txt.println(s);
        txt.close();
    }
}
