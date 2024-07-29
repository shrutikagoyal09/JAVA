public class Revision {
    private Node head;
    private int size;
    public Revision(){
        this.size =0;
    }

    //inserting element at first position
    public void insertFirst(int data){
        Node node = new Node(data);
        node.next=head;
        head=node;
        size++;
    }

    //inserting element at last
    public void insertLast(int data){
        if(head ==null){
            insertFirst(data);
            return;
        }
        Node node = new Node(data);
        Node temp= head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
        size++;

    }

    //inserting element in the middle of the list

    public void insert(int data, int index){
        if(index==0){
            insertFirst(data);
            return;
        }
        if(index==size){
            insertLast(data);
            return;
        }

        Node temp = head;
        for(int i=1; i<index; i++){
            temp = temp.next;
        }
        Node node = new Node(data,temp.next);
        temp.next=node;
        size++;
    }

    //inserting elements using recursion
    public void insertRec(int val, int index){
        head = insertRec(val,index,head);
    }
    private Node insertRec(int val, int index, Node node){
        if(index ==0){
            Node temp = new Node(val, node);
            size++;
            return temp;
        }
        node.next = insertRec(val,index-1,node.next);
        return node;
    }

    //deleting first element
    public void deleteFirst(){
        Node temp=head;
        head = temp.next;
        size--;
    }

    //deleting last element
    public void deleteLast(){
        Node temp = head;
        while(temp.next.next != null){
            temp=temp.next;
        }
        temp.next=null;
        size--;
    }

    //deleting any spcific element in the list
    public void delete(int index){
        Node temp = head;
        for(int i=1; i<index; i++){
            temp=temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }

    //displaying elements
    public void display(){
        Node temp=head;
        while(temp !=null){
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
        System.out.println("END");
    }

    public class Node{
        private int data;
        private Node next;
        public Node(int data){
            this.data = data;
        }
        public Node(int data, Node next){
            this.data=data;
            this.next=next;
        }
    }
}
