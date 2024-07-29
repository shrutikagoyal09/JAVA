import java.util.*;
public class Rev {
    Scanner scanner = new Scanner(System.in);
    public class Node{
        private int value;
        private Node left;
        private Node right;
        public Node(int value){
            this.value = value;
        }
    }
    Node root;
    public void insert(Scanner scanner){
        System.out.println("Enter root node");
        int val = scanner.nextInt();
        root = new Node(val);
        insert(scanner, root);
    }
   public void insert(Scanner scanner, Node node){
       System.out.println("Do you want to insert at left of " + node.value + " ?");
       boolean ansleft = scanner.nextBoolean();
       if(ansleft == true){
           System.out.println("Enter the value for left of " + node.value + " :");
           int val = scanner.nextInt();
           node.left = new Node(val);
           insert(scanner, node.left);
       }


       System.out.println("Do you want to insert at right of " + node.value + " ?");
       boolean ansright = scanner.nextBoolean();
       if(ansright == true){
           System.out.println("Enter the value for right of " + node.value + " :");
           int val = scanner.nextInt();
           node.right = new Node(val);
           insert(scanner, node.right);
       }

   }

   public void display(){
        display(root, "Root Node: ");
   }
   private void display(Node node, String detail){
        if(node == null){
            return;
        }
       System.out.println(detail + node.value);
        display(node.left, "Left of" + node.value + " :");
       display(node.right, "Right of" + node.value + " :");
   }

}
