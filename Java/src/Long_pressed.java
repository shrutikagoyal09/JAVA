import java.util.Arrays;
public class Long_pressed {
    public static void main(String[] args) {
        String name = "alex";
        String typed = "aaleex";
        System.out.println(name);
        System.out.println(typed);

        char[] arr = typed.toCharArray();
        System.out.println(Arrays.toString(arr));
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] == arr[i+1]){
                arr[i+1] = ' ';
            }
        }
        System.out.println(Arrays.toString(arr));
        String n = new String(arr);
        System.out.println(n);
        n = n.replaceAll(" ","");
        System.out.println(n);
        System.out.println(n.equals(name));
    }
}
