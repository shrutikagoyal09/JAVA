public class LL_recursion {
    private Node head;
    private int size;
    public LL_recursion(){
        this.size = 0;
    }


    public void insertRec(int val, int index){
        head = insertRec(val, index, head);
    }
    private Node insertRec(int val, int index, Node node){
        if(head == null && index == 0){
            Node temp = new Node(val);
            size++;
            return temp;
        }
        if(index == 0){
            Node temps = new Node(val, node);
            size++;
            return temps;
        }

        node.next = insertRec(val, index-1,node.next);
        return node;
    }

    public void display(){
        Node node = head;
        while(node != null){
            System.out.print(node.val + "->");
            node = node.next;
        }
        System.out.println("END");
    }

   public class Node{
       private int val;
       private Node next;
       public Node(int val){
           this.val = val;
       }
       public Node(int val, Node next){
           this.val = val;
           this.next = next;
       }
   }
}
