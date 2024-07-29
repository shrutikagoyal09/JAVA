

public class set_bit_to_zero {
    public static void main(String[] args) {


        int x = 12;
        int ans =rightmostBit(x);
        System.out.println(ans);
    }
    static int rightmostBit(int x){
        return (int)((Math.log(x&((~x)+1)))/Math.log(2))+1;
    }
}
