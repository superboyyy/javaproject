package maxArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class IntegerMax {
    public static Integer max(ArrayList<Integer> list) {
        if (list == null | list.size() == 0) {
            return null;
        }
        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a integer list end with 0: ");
        ArrayList<Integer> list = new ArrayList<>();
        while(true) {
            int a = in.nextInt();
            if (a == 0)
                break;
            list.add(a);
        }
        System.out.println("The maximum number is " + max(list));
    }
}
