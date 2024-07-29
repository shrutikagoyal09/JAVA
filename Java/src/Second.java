import java.util.Scanner;
public class Second {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String name;

        int roll;

        float per;

        System.out.println("Enter your name:");
        name = input.next();
        System.out.println("Enter your roll number:");
        roll = input.nextInt();
        System.out.println("Enter your percentage:");
        per = input.nextFloat();
        System.out.println("Your name:" + name);
        System.out.println("Your roll number:" + roll);
        System.out.println("Your prcentage:" + per);

    }
}
