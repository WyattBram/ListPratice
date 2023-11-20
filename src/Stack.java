public class Stack {
    private Node first = null;

    public void push(int n){
        Node newNode = new Node();
        newNode.number = n;
        newNode.next = first;
        first = newNode;
    }

    public void pop(){
        Node current = first;
        Node previous = current;

        if (current == null){
            return;
        }

        if (first.next == null){
            first = null;
        }

        while (current.next!=null){
            previous = current;
            current = current.next;
        }

        previous.next = null;
    }

    public void peek(){
        if (first == null){
            System.out.println("Nothing in the stack");
            return;
        }
        System.out.println(first.number);
    }



    public void display(){
        Node current = first;
        while (current!=null){
            System.out.print(current.number + " --> ");
            current = current.next;
        }
    }



}
