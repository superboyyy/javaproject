package deleteText;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class DeleteText{
    public static void main(String[] args) throws Exception{
        if (args.length != 2) {
            System.out.println("Usage: java DeleteText targetString targetFile");
            System.exit(1);
        }

        File targetFile = new File(args[1]);
        if (!targetFile.exists()) {
            System.out.println("Target file " + args[1] + " does not exist!");
            System.exit(2);
        }

        Scanner in = new Scanner(targetFile);
        StringBuilder sb = new StringBuilder();

        while (in.hasNext()) {
            String s1 = in.nextLine();
            sb.append(s1.replaceAll(args[0],"") + "\n");
        }

        PrintWriter output = new PrintWriter(targetFile);
        output.println(sb.toString());
        output.close();
    }
}
