public class Rev {
    public class Node{
        private int value;
        private int startInterval;
        private int endInterval;
        private Node left;
        private Node right;
        public Node(int start,int end){
//            this.value = value;
            this.startInterval = start;
            this.endInterval = end;
        }
    }
    public Node root;
    public Rev(int[] arr){
        root = constructTree(arr,0,arr.length-1);
    }
    public Node constructTree(int[] arr, int start, int end){
        if(start == end){
            Node leaf = new Node(start,end);
            leaf.value = arr[start];
            return leaf;
        }
        Node node = new Node(start,end);
        int mid = (start + end)/2;
        node.left = constructTree(arr,start,mid);
        node.right = constructTree(arr,mid+1,end);
        node.value = node.left.value + node.right.value;
        return node;
    }
    public int query(int qsi, int qei){
       return query(qsi, qei,root);
    }
    public int query(int qsi, int qei, Node node){
        if(node.startInterval >= qsi && node.endInterval <= qei){
            return node.value;
        }
        else if(node.endInterval < qsi || node.startInterval > qei){
            return 0;
        }
        else{
           return query(qsi, qei, node.left) + query(qsi, qei, node.right);
        }
    }
    public void update(int index, int value){
        update(index, value, root);
    }
    private Node update(int index, int value, Node node){
        if(node.startInterval == index && node.endInterval == index){
            node.value = value;
            return node;
        }
        if(index >= node.startInterval && index <= node.endInterval){
            if(index > node.endInterval || index < node.startInterval){
                return node;
            }
            node.left = update(index,value,node.left);
            node.right = update(index,value,node.right);
            node.value = node.left.value + node.right.value; 
        }
        return node;
    }
    public void display(){
        display(root, "Root Node: ");
    }
    public void display(Node node, String detail){
        if(node == null){
            return;
        }
        System.out.println(detail + "[ " + node.startInterval + " ," + node.value + " ," + node.endInterval + " ]");
        display(node.left, "Left of " + node.value + " :");
        display(node.right, "Right of " + node.value + " :");
    }
}
