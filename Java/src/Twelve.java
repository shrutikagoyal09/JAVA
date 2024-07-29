import java.util.Scanner;
public class Twelve {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = input.next().charAt(0);
        if(ch >= 97 && ch <= 122){
            System.out.println("It is a small letter.");
        } else if(ch >= 65 && ch <= 90) {
            System.out.println("It is a capital letter.");
        }
        else if(ch >= 48 && ch <= 57) {
            System.out.println("It is a digit.");
        }
        else{
            System.out.println("It is a symbol.");
        }


    }
}
