import java.util.*;

public class Main {
    public static void main(String[] args) {
      FindSuccessor tree = new FindSuccessor();
        Scanner scanner= new Scanner(System.in);
        tree.constructTree(scanner);
        tree.display(scanner);

    }
}