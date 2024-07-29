import java.util.ArrayList;

public class Subset_revision {
    public static void main(String[] args) {
//        subset(" ","baccad");
//        System.out.println(subset2("baccad"));
//        subset3("","abc");
        ArrayList<String> ans = subset4("abc", "");
        System.out.println(ans);
    }
    static void subset(String ans, String str){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        if(ch == 'a'){
            subset(ans,str.substring(1));
        }
        else{
            subset(ans+ch,str.substring(1));
        }
    }

    static String subset2(String str){
        if(str.isEmpty()){
            return " ";
        }
        char ch = str.charAt(0);
        if(ch == 'a'){
            return subset2(str.substring(1));
        }
        else{
            return ch + subset2(str.substring(1));
        }
    }


    static void subset3(String ans, String str){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        subset3(ans+ch,str.substring(1));
        subset3(ans,str.substring(1));
        subset3(ans+ (ch+0),str.substring(1));
    }


    static ArrayList<String> subset4(String str,String ans){
        if(str.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        char ch = str.charAt(0);
        ArrayList<String> first = subset4(str.substring(1), ans+ch);
        ArrayList<String> second = subset4(str.substring(1), ans);
        ArrayList<String> third = subset4(str.substring(1), ans+ (ch+0));
        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
