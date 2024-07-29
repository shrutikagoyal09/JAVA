import java.util.Scanner;
public class Seven {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("Two numbers are: " +a +" " +b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("Two numbers after swapping are: " +a +" " +b);
    }
}
