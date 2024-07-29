import java.util.Scanner;
public class Pattern12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = input.nextInt();
        for(int i=1; i<=2*num; i++){
            if(i<=num){
                for(int s=1; s<i; s++){
                    System.out.print(" ");
                }
                for(int j=num-i+1; j>=1; j--){
                    System.out.print(" *");
                }

                System.out.println(" ");
            }
            else{
                for(int s=1; s<=2*num -i; s++){
                    System.out.print(" ");
                }
                for(int j=1; j<=i-num; j++){
                    System.out.print(" *");
                }

                System.out.println(" ");
            }
        }
    }
}
