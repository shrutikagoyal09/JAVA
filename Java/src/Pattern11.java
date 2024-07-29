import java.util.Scanner;
public class Pattern11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = input.nextInt();
        for(int i=1; i<=num; i++){
            for(int s=1; s<=i; s++){
                System.out.print(" ");
            }
            for(int j=num-i+1; j>=1; j--){
                System.out.print(" *");
            }

            System.out.println(" ");
        }
    }
}
