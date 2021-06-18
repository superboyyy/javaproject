package queue;

public class Test {
    public void main(String[] args) {
        testQueue queue = new testQueue();

        queue.queue(1, 5);
        queue.queue(2, 10);
        queue.queue(3, 20);
        queue.queue(4, 10);
        queue.queue(5, 40);
        queue.queue(6, 10);


    }

    public class testQueue {
        int processID;
        int processPriority;

        public testQueue() {
        }

        public void queue(int processID, int processPriority) {
            this.processID = processID;
            this.processPriority = processPriority;
        }
    }
}