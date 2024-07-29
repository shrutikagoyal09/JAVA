// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       BubbleSort list = new BubbleSort();
        list.insertFirst(72);
        list.insertFirst(99);
        list.insertFirst(57);
        list.insertFirst(45);
        list.insertLast(8);
        list.insertLast(9);
        list.insert(55,5);
        list.display();
       list.sort();
       list.display();
//        list.reverse();


//        LL_recursion list = new LL_recursion();
//        list.insertRec(1,0);
//        list.insertRec(4,1);
//        list.insertRec(2,2);
//        list.insertRec(5,3);
//        list.insertRec(9,4);
//        list.display();

    }
}