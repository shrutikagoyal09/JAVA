import java.sql.SQLOutput;
import java.util.Arrays;
public class String_lookalike {
    public static void main(String[] args) {
        String s = "Mr Ding";
        String[] ch = s.split(" ");

        String x ="";
        for(int i=0; i<ch.length; i++){
            String sh = ch[i];

            char[] arr = sh.toCharArray();

            int start=0;
            int end =arr.length-1;
            while(start<end){
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }

            String n = new String(arr);

            x = x+ n+ " ";



        }
        System.out.println(x);
    }
}
