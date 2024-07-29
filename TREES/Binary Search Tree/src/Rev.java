public class Rev {
    public class Node{
        private int value;
        private int height;
        private Node left;
        private Node right;
        public Node(int value){
            this.value = value;
        }
    }
    public int height(Node node){
        if(node == null){
           return -1;
        }
        return node.height;
    }
    public Node root;
    public void insert(int value){
        root = insert(value,root);
    }
    private Node insert(int value, Node node){
        if(node == null){
            node = new Node(value);
            return node;
        }
        if(value > node.value){
            node.right = insert(value, node.right);
        }
        if(value < node.value){
           node.left= insert(value,node.left);
        }
        node.height = Math.max(height(node.left),height(node.right))+1;
    return node;
    }
    public boolean balanced(){
        return balanced(root);
    }
    public boolean balanced(Node node){
        if(node == null){
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <=1 &&  balanced(node.left) && balanced(node.right);
    }
    public void display(){
        display(root, " Root Node");
    }
    private void display(Node node, String details){
        if(node == null){
            return;
        }
        System.out.println(details + node.value);
        display(node.left, "Left of " + node.value + " :");
        display(node.right, "Right of " + node.value + " :");
    }
}
