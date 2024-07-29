public class Hcf {
    public static void main(String[] args) {
        int a =2;
        int b=4;
        int ans = gcd(a,b);
        System.out.println(ans);
    }
    static int gcd(int a, int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }
}
