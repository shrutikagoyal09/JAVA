public class DLL {
    private Node head;

    int size;
    public DLL(){
        this.size =0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next =head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
    }


    public void insertLast(int val){
        Node node = new Node(val);
        Node last = head;

        node.next = null;
        if(head == null){
            node.prev = null;
            head = node;
            return;
        }
        while(last.next != null){
            last = last.next;
        }
        last.next = node;
        node.prev = last;

    }


    public Node find(int val){
        Node node = head;
        while(node != null){
            if(node.value == val){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void insert(int after, int value){
        Node p = find(after);
        if(p==null){
            System.out.println("does not exist!!");
            return;
        }
        Node node = new Node(value);
        node.next = p.next;
        node.prev = p;
        p.next = node;
        if(node.next !=null){
            node.next.prev = node;
        }
    }


    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    public int deleteLast(){
        Node last = head;
        while(last.next !=null){
            last = last.next;
        }
        int val = last.value;
        last.prev.next = null;
        size--;
        return val;
    }


    public int delete(int val){
        Node p = find(val);
        if(p == null){
            System.out.println("does not exist");
        }
        int value = p.value;
        p.prev.next = p.next;
        p.next.prev = p.prev;
        return value;
    }

    public void display(){
        Node node = head;
        Node last = null;
        while(node != null){
            System.out.print(node.value + "->");
            last = node;
            node = node.next;

        }
        System.out.println("END");

        while(last != null){
            System.out.print(last.value + "->");
            last = last.prev;
        }
        System.out.println("START");
    }


    public class Node{
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }
        public Node(int value,Node prev,Node next){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
