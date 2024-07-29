import java.util.Scanner;
public class Ten {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = input.nextInt();
        int b = input.nextInt();
        if(a > b){
            System.out.println(+a +" is greater.");
        }
        else{
            System.out.println(+b +" is greater.");
        }
    }
}
