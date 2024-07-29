import java.util.Arrays;
public class Sorting_string {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
//        System.out.println(s);

        String[] arr = s.split(" ");
//        System.out.println(Arrays.toString(arr));

        String[] newarr = new String[arr.length];
        String b=" ";
        for(int i=0; i<arr.length; i++){
            String sh = arr[i];
//            System.out.println(sh);
            char x = sh.charAt(sh.length()-1);
//            System.out.println(x);
            int a = x - '0';
//            System.out.println(a);
            newarr[a-1] = sh;

        }
//        System.out.println(Arrays.toString(newarr));
        for(int i=0; i<newarr.length; i++){
            b = b + newarr[i];
        }
        b = b.replaceAll("[^a-zA-Z]", " ");
        System.out.println(b);
    }
}
