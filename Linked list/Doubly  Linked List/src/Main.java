// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//       DLL list = new DLL();
        Rev list = new Rev();
       list.insertFirst(5);
        list.insertFirst(9);
        list.insertFirst(7);
        list.insertFirst(3);
        list.insertFirst(99);
        list.display();

        list.insertLast(12);
        list.display();

        list.insert(88,3);
        list.display();

        list.deleteFirst();

        list.display();
        list.deleteLast();
        list.display();

        list.delete(2);
        list.display();
    }
}