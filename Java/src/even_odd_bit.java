import java.util.Scanner;
public class even_odd_bit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = input.nextInt();
        System.out.println(isEven(n));
    }
    static boolean isEven(int n){
        if((n&1) == 1){
            return false;
        }
        return true;
    }
}
