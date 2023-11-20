public class Queue {
    private Node first = null;


    public void enQueue(int n){
        Node newNode=new Node();
        newNode.number = n;
        newNode.next = first;
        first = newNode;
    }
    public void deQueue(){
        if (first == null){
            return;
        }
        first = first.next;
    }

    public void display(){
        Node current = first;

        while(current!=null){
            System.out.print(current.number + " --> ");
            current = current.next;
        }
    }
    

}
