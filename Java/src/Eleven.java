import java.util.Scanner;
public class Eleven {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character:");
        char ch = input.next().charAt(0);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println("Character is vowel.");
        }
        else{
            System.out.println("Character is not vowel.");
        }
    }


}
