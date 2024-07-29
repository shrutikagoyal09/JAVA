import java.util.Scanner;
public class Pattern28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for(int i=1; i<2*num; i++){
            if(i<=num) {
                for(int s=1; s<num-i+1; s++){
                    System.out.print(" ");
                }
                for(int j=1; j<=i; j++){
                    System.out.print(" *");
                }

                System.out.println(" ");
            }
            else{
                for(int s=1; s<=i-num; s++){
                    System.out.print(" ");
                }
                for(int j=2*num-i; j>=1; j--){
                    System.out.print(" *");
                }

                System.out.println(" ");
            }
            }
        }
    }
