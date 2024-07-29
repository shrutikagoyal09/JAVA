import java.util.Scanner;
public class Nine {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = input.nextInt();
        System.out.println("The number is: " +a);
        if(a % 2 == 0)
            System.out.println("The number is even.");

        else
            System.out.println("The number is not even.");

    }
}

