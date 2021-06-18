package replaceText;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class replaceText{
    public static void main(String[] args) throws Exception{
        if (args.length != 3) {
            System.out.println("Usage: java replaceText file oldString newString");
            System.exit(1);
        }

        File file = new File(args[0]);
        if (!file.exists()) {
            System.out.println("The file " + args[0] + " doesn't exist!");
            System.exit(2);
        }

        Scanner in = new Scanner(file);
        StringBuilder sb = new StringBuilder();

        while (in.hasNext()) {
            String s1 = in.nextLine();
            sb.append(s1.replaceAll(args[1], args[2]) + "\n");
        }

        PrintWriter output = new PrintWriter(file);
        output.println(sb.toString());
        output.close();
    }
}
