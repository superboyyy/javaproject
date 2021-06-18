public class InsertionSort {
public static <AnyType extends Comparable<? super AnyType>>
AnyType[] InsertionSort(AnyType[] a) {
    int j;

    for (int p = 1; p < a.length; p++) {
        AnyType tmp = a[p];
        for (j = p; j > 0 && tmp.compareTo(a[j - 1]) < 0; j--) {
            a[j] = a[j - 1];
        }
        a[j] = tmp;
    }
    return a;
}
public static void main(String[] args) {
    Integer[] test = {1,2,3,8,9,4,2,0,1,2,6,8,2,5,8};
    System.out.println(InsertionSort(test));
}
}