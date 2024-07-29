import java.util.Scanner;
public class Fourteen {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
       System.out.println("Choose the operation you want to perform: \n 1. Addition \n 2. Subtraction \n 3. Multiplication \n 4. Division" );
       int c = input.nextInt();
       switch(c){
           case 1:
               System.out.println("Addition: " +(a+b));
               break;
           case 2:
               System.out.println("Subtraction: " +(a-b));
               break;
           case 3:
               System.out.println("Multiplication: " +(a*b));
               break;
           case 4:
               System.out.println("Division: " +(a%b));
               break;
           default:
               System.out.println("Wrong operation chosen!! ");
       }
    }
}
