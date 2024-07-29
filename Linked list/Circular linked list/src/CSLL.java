public class CSLL {
    private Node head;
    private Node tail;
    public CSLL(){
        this.head = null;
        this.tail = null;
    }
    public void insert(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }
    public class Node{
        private int value;
        private Node next;

        public Node(int val){
            this.value = val;
        }
        public Node(int val,Node next){
            this.value = val;
            this.next = next;
        }
    }
}
