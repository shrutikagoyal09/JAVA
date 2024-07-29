public class Add_binary {
    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        String ans = addBinary(a,b);
        System.out.println(ans);
    }
    static String addBinary(String a, String b){
        int c = Integer.parseInt(a,2);
        System.out.println(c);
        int d = Integer.parseInt(b,2);
        System.out.println(d);
        int x = c+d;
        return Integer.toBinaryString(x);
    }
}
