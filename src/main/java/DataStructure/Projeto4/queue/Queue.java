package DataStructure.Projeto4.queue;

public class Queue {

    private Node First;
    private Node Last;
    private int lenght;

    public class Node {

        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }

        public int getValue() { return this.value; }
    }

    public Queue(int value) {
        Node newNode = new Node(value);
        First = newNode;
        Last = newNode;
        lenght++;
    }

    public void getFirst() {
        if (First != null) {
            System.out.println("First: " + First.value);
        }else{
            System.out.println("Fila está vazia");
        }
    }

    public void getLast() {
        if (Last != null) {
            System.out.println("Last: " + Last.value);
        }else{
            System.out.println("Fila está vazia");
        }
    }

    public void getLength() {
        System.out.println("Length: " + lenght);
    }

    public void print() {
        Node temp = First;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println("###############");
    }

    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (lenght == 0) {
            First = newNode;
            Last = newNode;
        }else{
            Last.next = newNode;
            Last = newNode;
        }
        lenght++;
    }

    public Node dequeue() {
        if (lenght == 0) return null;
        Node temp = First;
        if (lenght == 1) {
            First = null;
            Last = null;
        }else{
            First = First.next;
            temp.next = null;
        }
        lenght--;
        return temp;
    }

    public static void main(String[] args) {
        Queue myQueue = new Queue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);

        System.out.println(myQueue.dequeue().value);
        System.out.println(myQueue.dequeue().value);
        System.out.println(myQueue.dequeue().value);

//        myQueue.getFirst();
//        myQueue.getLast();
//        myQueue.getLength();
//
//        myQueue.print();

//        myQueue.enqueue(2);
//        myQueue.enqueue(3);

    }

}
