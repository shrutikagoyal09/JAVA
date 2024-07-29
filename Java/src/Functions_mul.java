// to take two numbers from user and return their multiplication.

import java.util.Scanner;

public class Functions_mul {
//    public static void mul(int a, int b){
//        int multiply = a * b;
//        System.out.println("Multiplication of two numbers is: " +multiply);
//    }
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter two numbers: ");
//        int num1 = input.nextInt();
//        int num2 = input.nextInt();
//        mul(num1, num2);
//
//
//    }

    public static int mul(int a, int b){
        int multiply = a * b;
        return multiply;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println("Multiplication of two numbers: " +mul(num1, num2));


    }
}
