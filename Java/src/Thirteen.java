import java.util.Scanner;
public class Thirteen {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        System.out.println("Enter your gender: ");
        String gen = input.next();
        System.out.println("Enter your martial status: ");
        String sta = input.next();
        System.out.println("Age: " +age);
        System.out.println("Gender: " +gen);
        System.out.println("Martial status: " +sta);
    }
}
