import java.util.Scanner;
public class Seventeen {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = input.nextInt();
        int sum = 0;
        while(n>0){
          sum = sum + n%10;
          n = n/10;
        }
        System.out.println("Sum of digit of number is: " +sum);
    }
}
