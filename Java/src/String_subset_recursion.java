import java.util.ArrayList;
public class String_subset_recursion {
    public static void main(String[] args) {
        System.out.println(subSeq2("abc",""));
    }
    static void subSeq(String str, String ans){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        subSeq(str.substring(1),ans+ch);
        subSeq(str.substring(1),ans);
    }


    //METHOD 2

    static ArrayList<String> subSeq2(String str, String ans){
        if(str.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        char ch = str.charAt(0);
         ArrayList<String> left = subSeq2(str.substring(1),ans+ch);
        ArrayList<String> right = subSeq2(str.substring(1),ans);

        left.addAll(right);
        return left;
    }
}
