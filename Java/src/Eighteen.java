import java.util.Scanner;
public class Eighteen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = input.nextInt();
        int a = n % 10;
        System.out.println("Value of a is: " +a);
        int j = 0;
        while(n > 0){
          j =n % 10 ;
          n=n/10;
        }
        System.out.println("Value of j is: " +j);
       int sum = j + a;
        System.out.println("Sum of first and last digit of number is: " +sum);
    }
}