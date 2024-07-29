public class Rev{
    private Node head;
    private int size;
    public Rev(){
        this.size=0;
    }
    public class Node{
        private int value;
        private Node next;
        private Node prev;
        public Node(int value){
            this.value = value;
        }
        public Node(int value,Node prev, Node next ){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}