public class LinkedList {
    private Node first = null;

    public void addFront(int n){
        Node newNode = new Node();
        newNode.number = n;
        newNode.next = first;
        first = newNode;
    }

    public void addBack(int n){
        Node newNode = new Node();
        newNode.number = n;

        Node current = first;
        if (current == null){
            first = newNode;
            return;
        }
        while (current.next!=null){
            current = current.next;
        }
        current.next = newNode;
    }

    public void delete(int n){
        Node current = first;
        Node previous = current;
        if (current == null){
            return;
        }
        try {
            while(current.number!= n){
                previous = current;
                current = current.next;
            }
            previous.next = current.next;

        } catch (Exception e) {
            System.out.println("Not in here dummy");
        }

    }
    public void deleteFront(){
        Node current = first;
        if (current == null){
            return;
        }
        first =first.next;

    }
    public void deleteBack(){
        Node current = first;
        Node previous = current;

        if (current == null){
            return;
        }
        while (current.next!=null){
            previous = current;
            current = current.next;
        }
        previous.next = current.next;

    }




    public void display(){
        Node current = first;

        while(current!=null){
            System.out.print(current.number + " --> ");
            current = current.next;
        }
    }
}
