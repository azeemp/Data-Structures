public class LinkedList {
    private Node head;

    public  void addNode(int f){
        Node m = new Node(f);
        if(this.head==null){
            this.head = m;
        }else{
            m.next = this.head;
            this.head = m;
        }
    }
    public void append(int newdata)
    {

        Node newnode = new Node(newdata);

        if (head == null)
        {
            head = new Node(newdata);
            return;
        }
        newnode.next = null;
        Node last = head;
        while (last.next != null)
            last = last.next;
        last.next = newnode;
        return;
    }

    public Node gethead() {
        return this.head;
    }

    public void print(LinkedList list){
        Node n = list.gethead();
        while(n!=null){
            System.out.print(n.data +" ");
            n = n.next;
        }
    }

    public void removeDuplicates(Node n){
        Node current=head;
        while(current!=null){

            Node runner=current;
            while(runner.next!=null){

                if(runner.next.data==current.data){
                    runner.next=runner.next.next;
                }
                else
                    runner=runner.next;
            }
            current=current.next;}
    }
    
    public  class Node{
        Node next;
        int data;

        public Node(int d){
            this.data = d;
        }

        public Node() {
            this.data=1;
        }
    }


    public Node mergeSortedLists(Node first, Node second) {
        Node head;
        if (first == null)
            return second;
        else if (second == null)
            return first;
        else if (first.data <= second.data) {
            head = first;
            head.next = mergeSortedLists(first.next, second);
        } else {
            head = second;
            head.next = mergeSortedLists(first, second.next);
        }
        return head;
    }

}

