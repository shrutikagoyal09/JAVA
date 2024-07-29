public class BubbleSort {
    private Node head;
    public int size;
    public BubbleSort(){
        this.size=0;
    }
    public void insertFirst(int data){
        Node node=new Node(data);
        node.next=head;
        head=node;
        size++;
    }
    public void insertLast(int data){
        if(head ==null){
            insertFirst(data);
        }
        Node node = new Node(data);
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
        size++;
    }

    public void insert(int data, int index){
        if(index==0){
            insertFirst(data);
        }
        if(index==size){
            insertLast(data);
        }
        Node temp=head;
        for(int i=0; i<index-1; i++){
            temp=temp.next;
        }
        Node node = new Node(data,temp.next);
        temp.next=node;
        size++;
    }
    public int length(){
        Node length = head;
        int count=0;
        while(length!=null){
            length=length.next;
            count++;
        }
        return count;
    }

    public void sort(){
       int count =length();
        bubbleSort(count-1,0);
    }
    public void bubbleSort(int rows, int col){
        if(rows==0){
            return;
        }
        if(col<rows) {
            Node f = get(col);
            Node s = get(col + 1);

            if (f.val > s.val) {
                if (f == head) {
                    head = s;
                    f.next = s.next;
                    s.next = f;
                }
//                } else if (s.next == null) {
//                    Node temp = get(col - 1);
//                    temp.next = s;
//                    s.next = f;}
                else {
                    Node prev = get(col - 1);
                    f.next = s.next;
                    s.next = f;
                    prev.next = s;
                }

            }
            bubbleSort(rows, col + 1);
        }
        else {
                bubbleSort(rows-1,0);
        }

    }

    public Node get(int index){
        Node temp=head;
        for(int i=0; i<index; i++){
            temp=temp.next;
        }
        return temp;
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val + "->");
            temp=temp.next;
        }
        System.out.println("END");
        System.out.println();
    }
    public class Node{
        private int val;
        private Node next;
        public Node(int val){
            this.val=val;
        }
        public Node(int val, Node next){
            this.val=val;
            this.next=next;
        }

    }
}
