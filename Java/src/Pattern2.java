import java.util.Scanner;
public class Pattern2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of lines: ");
        int num = input.nextInt();
        for(int i=1; i<=num; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
