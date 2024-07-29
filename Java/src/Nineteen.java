import java.util.Scanner;
public class Nineteen {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = input.nextInt();
        int rev = 0;
        int j;
        while(a > 0){
            j = a % 10;
            a=a/10;
           rev = rev * 10 + j;
        }
        System.out.println("REVERSE NUMBER IS : " +rev);
    }
}
