import java.util.Scanner;
public class Twenty_one {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = input.nextInt();
        for(int i=1; i<=a; i++){
            System.out.println(+i);
        }
    }
}
