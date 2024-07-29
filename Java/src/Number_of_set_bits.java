public class Number_of_set_bits {
    public static void main(String[] args) {
        int n =7;
        int ans = setBit(n);
        System.out.println(ans);
    }
    static int setBit(int n){
        int count =0;
        while(n>0){
            count++;
            n = n & (n-1);
        }
        return count;
    }
}
