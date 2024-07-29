public class SegmentTree {
    public class Node{
        private int data;
        private int startInterval;
        private int endInterval;
        private Node left;
        private Node right;
        public Node(int startInterval, int endInterval){
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }
    }
    Node root;
    public SegmentTree(int[] arr){
      this.root = constructTree(arr, 0 , arr.length-1);
    }
    public Node constructTree(int[] arr, int start, int end){
        if(start == end){
            Node leaf = new Node(start, end);
            leaf.data = arr[start];
            return leaf;
        }
        Node node = new Node(start,end);
        int mid = (start+end)/2;
        node.left = constructTree(arr,start ,mid);
        node.right = constructTree(arr,mid+1,end);
        node.data = node.left.data + node.right.data;
        return node;
    }

    public int query(int qsi,int qei){
        return this.query(root,qsi,qei);
    }
    public int query(Node node, int qsi, int qei){
        if(node.startInterval == qsi && node.endInterval == qei) {
            return node.data;
        }
        else if(node.endInterval < qsi || node.startInterval > qei){
                return 0;
        }
        else{
               return query(node.left, qsi, qei ) + query(node.right,qsi,qei);
        }

    }

    public void update(int index,int value){
        this.root.data = update(root,index,value);
    }
    private int update(Node node, int index, int value){
        if(index >= node.startInterval && index <= node.endInterval ){
            if(index == node.startInterval && index == node.endInterval){
                node.data = value;
                return node.data;
            }
            else{
                int leftans = update(node.left,index,value);
                int rightans = update(node.right,index,value);

                node.data = leftans + rightans;
                return node.data;
            }
        }
        return node.data;
    }

    public void display(){
        display(root);
    }
    public void display(Node node) {
        String str = "";

        if (node.left != null) {
            str = str + "Interval [" + node.left.startInterval + "," + node.left.endInterval + "] data : " + node.left.data;
        }
        else{
            str = str + "no left child";
        }

        str = str + "Interval [" + node.startInterval + " ," + node.endInterval + "] data : " + node.data;
        if (node.right != null) {
            str = str + "Interval [" + node.right.startInterval + "," + node.right.endInterval + "] data : " + node.right.data;
        }
        else{
            str = str + "no right child";
        }

        System.out.println(str);

        if(node.left != null){
            display(node.left);
        }
        if(node.right != null){
            display(node.right);
        }
    }
}
