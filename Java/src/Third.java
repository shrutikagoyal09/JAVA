import java.util.Scanner;
public class Third {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);


        System.out.println("Enter a Character: ");
        char ch = input.next().charAt(0);
        System.out.println("Character is: " + ch);
        int ans = ch;
        System.out.println("It's ASCII is: " + ans);

    }
}
