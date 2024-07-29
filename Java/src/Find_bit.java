import java.util.Scanner;
public class Find_bit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the bit: ");
        int i = input.nextInt();
        int x = 7;
        int ans =findBit(x,i);
        System.out.println(ans);
    }
    static int findBit(int x,int i){
     return ((x & (1 << (i-1)))>> (i-1) );
    }
}
