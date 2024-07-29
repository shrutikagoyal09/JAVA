import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of lines: ");
        int num = input.nextInt();
        for(int i=1; i<=num; i++){
            for(int j=1; j<=num-i+1; j++){
                System.out.print(" ");
            }
            for(int s=1; s<=2*i-1; s++){
                System.out.print("*");
            }

            System.out.println(" ");
        }
    }
}

