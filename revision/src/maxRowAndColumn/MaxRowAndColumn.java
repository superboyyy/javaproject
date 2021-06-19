package maxRowAndColumn;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxRowAndColumn {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the array size n: ");
        int a = in.nextInt();
        int[][] number = new int[a][a];
        System.out.println("The random array is ");
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                number[i][j] = (int)(Math.random() * 2);
                System.out.print(number[i][j]);
            }
            System.out.println();
        }

        int rowSum = sumRow(number[0]);
        ArrayList<Integer> listRow = new ArrayList<>();
        for (int i = 0; i < number.length; i++) {
            if (rowSum < sumRow(number[i])) {
                rowSum = sumRow(number[i]);
                listRow.clear();
                listRow.add(i);
            }
            else if (rowSum == sumRow(number[i]))
                listRow.add(i);
        }
        System.out.print("The largest row index: ");
        for (int i = 0; i < listRow.size() - 1; i++) {
            System.out.print(listRow.get(i) + ", ");
        }
        System.out.print(listRow.get(listRow.size() - 1));

        int columnSum = sumColumn(number, 0);
        ArrayList<Integer> listColumn = new ArrayList<>();

        for (int i = 0; i < number[0].length; i++) {
            if (columnSum < sumColumn(number, i)) {
                columnSum = sumColumn(number, i);
                listColumn.clear();
                listColumn.add(i);
            }
            else if (columnSum == sumColumn(number, i)) {
                listColumn.add(i);
            }
        }
        System.out.print("\nThe largest column index: ");
        for (int i = 0; i < listColumn.size() - 1; i++) {
            System.out.print(listColumn.get(i)+ ", ");
        }
        System.out.print(listColumn.get(listColumn.size() - 1));
    }


    public static int sumRow(int row[]) {   //计算指定行的和
        int sum = 0;
        for (int i = 0; i < row.length; i++) {
            sum += row[i];
        }
        return sum;
    }

    public static int sumColumn(int matrix[][], int column) {    //计算指定列的和
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][column];
        }
        return sum;
    }
}
