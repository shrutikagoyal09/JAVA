import java.util.Scanner;
public class Pattern26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = input.nextInt();
        for(int i=1; i<=num; i++){
            for(int j=1; j<=num-i+1; j++){
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
