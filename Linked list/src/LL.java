
public class LL{
    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size =0;
    }


    public void insertFirst(int val){
        Node node = new Node(val);
        node.next =head;
        if(tail == null){
            tail = head;
        }
        head = node;
        size++;
    }


    public void insertLast(int val){

        if(head == null){
            insertFirst(val);
            return;
        }
        Node temp = head;

            while(temp.next != null){
                temp = temp.next;
            }

        Node node = new Node(val);
        temp.next = node;
        tail = node;
        size++;
    }

    public void insert(int val, int index){
        if(index ==0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for(int i=1; i<index; i++){
            temp = temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next = node;
        size++;
    }

    public void deleteFirst(){
        head = head.next;
        size--;
    }

    public void deleteLast(){
        if(size ==1){
            deleteFirst();
            return;
        }
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        size--;
    }


    public void delete(int index){
        Node temp = head;
        for(int i=1; i<index; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    public class Node{
        private int value;
        private Node next;
        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}