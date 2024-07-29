import java.util.Scanner;
public class Pattern1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of lines: ");
        int num = input.nextInt();
        for(int i=0; i<num; i++){
            for(int j=0; j< num; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }

    }
}
