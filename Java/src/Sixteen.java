import java.util.Scanner;
public class Sixteen {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = input.nextInt();
        int fact = 1;
        for(int i=a; i>=1; i-- ){
            fact = fact * i;
        }
        System.out.println("The factorial of " +a +" is " +fact);
    }
}
