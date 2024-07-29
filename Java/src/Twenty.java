import java.util.Scanner;
public class Twenty {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = input.nextInt();
        int rev = 0;
        int j;
        int i= a;
        while(i > 0){
            j = i % 10;
            i=i/10;
            rev = rev * 10 + j;
        }
        System.out.println("A: " +a);
        System.out.println("rev: " +rev);
        if(a == rev){
            System.out.println("it is PALINDROME NUMBER.");
        }
        else{
            System.out.println("it is NOT PALINDROME NUMBER.");
        }
    }
}
