//to find the factorial of number using functions

import java.util.Scanner;

public class Functions_factorial {
    public static int factorial(int a){
        for(int i= a-1; i>=1; i--){
            a = a *i;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int fact = input.nextInt();
        System.out.println("Factorial of the numbers is: " + factorial(fact));
    }
}
