public class AVLtree {
    public class Node{
        private int value;
        private int height;
        public Node left;
        public Node right;
        public Node(int value){
            this.value = value;
        }

        public int getValue(){
            return value;
        }
    }
    public int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }
    private Node root;
    public boolean isEmpty(){
        if(root == null){
            return true;
        }
        return false;
    }
    public void insert(int value){
        root = insert(value, root);
    }
    public Node insert(int value, Node node){
        if(node == null){
            node = new Node(value);
            return node;
        }
        if(value < node.value){
            node.left= insert(value,node.left);
        }
        if(value > node.value){
           node.right= insert(value,node.right);
        }

        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return rotate(node);
    }

    public Node rotate(Node node){
        if(height(node.left) - height(node.right) >1) {
            //left heavy
            if (height(node.left.left) - height(node.left.right) > 0) {
                //left-left case and right rotation will take place
                return rotateRight(node);
            }
            if (height(node.left.left) - height(node.left.right) < 0) {
                //left-right case and left rotation will take place
                node.left = rotateLeft(node.left);
                return rotateRight(node);
            }
        }
        if(height(node.right) - height(node.left) > 1){
            //right heavy
            if(height(node.right.right) - height(node.right.left) >0){
                //right-right case and left rotation will take place
                return rotateLeft(node);
            }
            if(height(node.right.right) - height(node.right.left) <0){
                //right-left case
                node.right = rotateRight(node.right);
                return rotateLeft(node.right);
            }
        }
        return node;
    }

    public Node rotateRight(Node node){
        Node p = node;
        Node c = p.left;
        Node t = c.right;
//        c.left = node.left.left;
        c.right = p;
        p.left = t;
        p.height = Math.max(height(p.left), height(p.right))+1;
        c.height = Math.max(height(c.left), height(c.right))+1;
        return c;
    }
    public Node rotateLeft(Node node){
        Node p = node;
        Node c = p.right;
        Node t = c.left;
        c.left = p;
        p.right = t;
        p.height = Math.max(height(p.left), height(p.right))+1;
        c.height = Math.max(height(c.left), height(c.right))+1;
        return c;
    }

    public void display(){
        display(root, "Root Node: ");
    }
    public void display(Node node, String details){
        if(node == null){
            return;
        }
        System.out.println(details + node.value);
        display(node.left, "Left Node of " + node.value + " : ");
        display(node.right, "Right Node of " + node.value + " : ");
    }
}
