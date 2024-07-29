import java.util.Scanner;
public class Eight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number(in seconds):");
        int a = input.nextInt();
        int b;
        b = a / 60;
        int c = a % 60;
        System.out.println("Time is: " +b +" in minutes " +c +" in seconds");
    }
}