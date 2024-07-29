public class Lcm {
    public static void main(String[] args) {
        int a=3;
        int b=7;
        int ans = lcm(a,b);
        System.out.println(ans);
    }
    static int gcd(int a,int b){
        if(a==0){
            return b;
        }
        return gcd(b%a, a);
    }
    static int lcm(int a, int b){
        return (a*b)/gcd(a,b);
    }
}
