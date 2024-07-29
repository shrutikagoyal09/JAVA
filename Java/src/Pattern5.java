import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of lines: ");
        int num = input.nextInt();
        for(int i=1; i<2*num; i++){
            if(i<=num){
                for(int j=1; j<=i; j++){
                    System.out.print("* ");
                }
                System.out.println(" ");
            }
            else{
                for(int j=1; j<=2*num-i; j++){
                    System.out.print("* ");
                }
                System.out.println(" ");
            }
        }
    }
}
