import java.util.Scanner;
public class Pattern10{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = input.nextInt();
        for(int i=1; i<=num; i++){
            if(i<=num){
                for(int s=1; s<num-i+1; s++){
                    System.out.print(" ");
                }
                for(int j=1; j<=i; j++){
                    System.out.print(" *");
                }

                System.out.println(" ");
            }
            else{

            }
        }

    }
}
