class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class myQueue {
    Node front;
    Node rear;

    myQueue(){
        front = rear=null;
    }
    public void enqueue(int data){
        Node newNode=new Node(data);
        if(front==null&& rear == null){
            front = rear=newNode;
            return;
        }
        if(rear==null){
            front = rear=newNode;
            return;
        }
        rear.next=newNode;
        rear=newNode;
    }
    public int dequeue(){
        if (front == null) {
            System.out.println("Queue is empty ");
            return -1;
        }
        int value = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return value;
    }
    public void print() {
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data);
            if(temp.next!=null){
                System.out.print("->");
            }
            temp = temp.next;
        }
        System.out.println();
    }
}
