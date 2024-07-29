// TO take two numbers from user and return their sum using functions.

import java.util.Scanner;

public class Functions {
//    public static int sum(int a, int b){
//        int sum = a+b;
//        return sum;
//    }
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter two numbers: ");
//        int num1 = input.nextInt();
//        int num2 = input.nextInt();
//        int summation = sum(num1,num2);
//        System.out.println("Sum of two numbers is: "+summation);
//    }

public static void sum(int a, int b){
    int sum = a + b;
    System.out.println(sum);
}
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
       System.out.println("Enter two numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        sum(num1,num2);

}
}
