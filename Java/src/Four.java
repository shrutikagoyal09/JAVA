import java.util.Scanner;
public class Four {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        System.out.println("Three numbers are: " +a +" " +b  +" " +c);
        int sum = a + b +c;
        System.out.println(" Sum of Three numbers are: " +sum);
        float avg = sum/3;
        System.out.println("Average of Three numbers are: " +avg);
    }
}
