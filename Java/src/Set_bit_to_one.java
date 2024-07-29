import java.util.Scanner;

public class Set_bit_to_one {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the bit: ");
        int i = input.nextInt();
        int x = 13;
        int ans =setBit(x,i);
        System.out.println(ans);
    }
    static int setBit(int x,int i){
        return ((x | (1 << (i-1))) );
    }
}
