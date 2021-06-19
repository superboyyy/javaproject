package maxArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxArrayList {
    public static Integer max(ArrayList<Integer> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
            }
    }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Enter a Integer list end with 0: ");
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int a = in.nextInt();
            if (a == 0) {
                break;
            }
            list.add(a);
        }
        System.out.println("The max integer of the list is " + max(list));
    }
}
