// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] arr = {3,8,7,6,-2,-8,4,9};
//        SegmentTree tree = new SegmentTree(arr);
//        tree.display();
        Rev tree = new Rev(arr);
        tree.display();
        System.out.println();
        System.out.println(  tree.query(2,6));
        tree.update(3,14);
        tree.display();
    }
}