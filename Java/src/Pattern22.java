import java.util.Scanner;
public class Pattern22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = input.nextInt();
        int x=1;
        for(int i=1; i<=num; i++){
            for(int j=1; j<i; j++){
                System.out.print(x);
                System.out.print(" ");
                if(x==1){
                    x=0;
                }
                else{
                    x=1;
                }
            }
            System.out.println(" ");


        }
    }
}
