public class SLLRev{
    private Node head;
    private int size;
    public SLLRev(){
        this.size=0;
    }
    public void insertFirst(int data){
        Node node = new Node(data);
        node.next = head;
        head = node;
        size++;
    }
    public void insertLast(int data){
        Node node = new Node(data);
        if(head == null){
            insertFirst(data);
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
        size++;
    }
    public void insert(int data, int index){
        if(index == 0){
            insertFirst(data);
            return;
        }
        if(index == size){
            insertLast(data);
            return;
        }
        Node node = new Node(data);
        Node temp = head;
        for(int i=0; i<index-1; i++){
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
        size++;
    }
    public void deleteFirst(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        head = head.next;
        size--;
    }
    public void deleteLast(){
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        size--;
    }
    public void delete(int index){
        Node temp = head;
        for(int i=0; i<index-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ->");
            temp = temp.next;
        }
        System.out.println("End");
    }
    public class Node{
        private int data;
        private Node next;
        public Node(int data){
            this.data = data;
        }
        public Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }
}