import java.util.Scanner;
public class Five {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of your choice:");
        int rad = input.nextInt();
        double area = 3.14 * rad * rad;
        System.out.println(" the area of circle is:" +area);
        double cir = 3.14 * 2 * rad;
        System.out.println(" the circumference of circle is:" +cir);
    }
}
