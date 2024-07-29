import java.util.*;
public class Main{
    public static void main(String[] args) {
        Rev tree = new Rev();
        tree.insert(15);
        tree.insert(10);
        tree.insert(9);
        tree.insert(20);
        tree.insert(14);
        tree.insert(18);
        tree.insert(22);
//        int[] nums = {1,2,3,4,5,6,7,8,9,10};
//        tree.populateSorted(nums);
        tree.display();
        System.out.println( tree.balanced());
    }
}