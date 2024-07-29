import java.util.Scanner;
public class Six {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(" two numbers are: " +a +" " +b);
        int c = a;
        a = b;
        b = c;
        System.out.println(" two numbers after swapping are: " +a +" " +b);
    }
}
