import java.util.Scanner;
public class Fifteen {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = input.nextInt();
        boolean b = false;
        for(int i=2; i<a; i++ ){
            if(a % i == 0){
               b = false;
               break;
            }
            else{
                b = true;
            }

        }
        if(b == true){
            System.out.println("The number is prime.");
        }
        else{
            System.out.println("The number is not prime.");
        }
    }
}
