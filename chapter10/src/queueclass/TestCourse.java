package queueclass;

public class TestCourse {
    public static void main(String[] args) {
        Queue test = new Queue();

        for (int i = 1; i <= 20; i++) {
            test.enqueue(i);
        }

        while (!test.empty()) {
            System.out.print(test.dequeue() + " ");
        }
    }
}
