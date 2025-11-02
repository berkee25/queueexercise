public class Main {
    public static void main(String[] args) {
        myQueue myqueue = new myQueue();
        myqueue.enqueue(10);
        myqueue.enqueue(20);
        myqueue.enqueue(30);
        myqueue.enqueue(40);
        myqueue.print(); //after the queue method 10 will not be visible in the output
        myqueue.dequeue();//first in first out
        myqueue.print();
    }
}
