import java.util.*;
public class BFS{
    public class Node{
        private int value;
        private Node left;
        private Node right;
        public Node(int value){
            this.value = value;
        }
    }
    public Node root;
    int count =0;
    public void constructTree(Scanner scanner){
        System.out.println("Enter Root Node: ");
        int value = scanner.nextInt();
        root = new Node(value);
        insert(scanner, root);
    }
    private void insert(Scanner scanner, Node node){
        System.out.println("Do you want to insert at left of " + node.value + "?" );
        boolean left = scanner.nextBoolean();
        if(left){
            System.out.println("Enter the value for left of " + node.value + ":");
            int value = scanner.nextInt();
            node.left = new Node(value);
            count++;
            insert(scanner, node.left);
        }
        System.out.println("Do you want to insert at right of " + node.value + "?" );
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.println("Enter the value for right of " + node.value + ":");
            int value = scanner.nextInt();
            node.right = new Node(value);
            count++;
            insert(scanner,node.right);
        }

    }

    public class Queue{
        public Node[] data;
        public static int size =15;
                public Queue(){
                 this(size);
        }
        public Queue(int size){
                    this.data = new Node[size];
        }
        int end =0;
        public boolean isEmpty(){
            if(end == 0){
                return true;
            }
            return false;
        }
        public boolean isFull(){
            if(end == data.length){
                return true;
            }
            return false;
        }
        public boolean insert(Node node){
            if(isFull()){
                return false;
            }
            data[end] = node;
            end++;
            return true;
        }
        public Node remove(){
            if(isEmpty()){
                return null;
            }
            Node remove = data[0];
            for(int i=1; i<end; i++){
                data[i-1] = data[i];
            }
            end--;
            return remove;
        }
    }
    Queue queue = new Queue();
    public void display(){
        System.out.println( levelOrder(root));
    }
    public List<List<Integer>> levelOrder(Node node) {
        List<List<Integer>> result = new ArrayList<>();
        queue.insert(node);
        while(!queue.isEmpty()){
            int size = queue.end;
            List<Integer> list = new ArrayList<>(size);
            for(int i=0; i<size; i++){
                Node a = queue.remove();
                list.add(a.value);
                if(a.left != null){
                    queue.insert(a.left);
                }
                if(a.right != null){
                    queue.insert(a.right);
                }
            }
            result.add(list);
        }
        return result;
    }


}
