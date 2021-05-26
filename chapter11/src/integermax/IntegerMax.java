package integermax;

import java.util.Scanner;
import java.util.ArrayList;

public class IntegerMax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer list ends with 0: ");
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        while(true) {
            int a = in.nextInt();
            if (a == 0)
                break;
            integerArrayList.add(a);
        }
        System.out.print("The maximum value is: " + max(integerArrayList));
    }
    public static Integer max(ArrayList<Integer> list) {
        if (list == null || list.size() == 0)
            return null;
        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) >= max)
                max = list.get(i);
        }
        return max;
    }
}
