import java.util.*;
public class Main {
    public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
//           BinaryTree tree = new BinaryTree();
//           tree.populate(scanner);
//           tree.prettyDisplay();

        Rev tree = new Rev();
        tree.insert(scanner);
        tree.display();

    }
}