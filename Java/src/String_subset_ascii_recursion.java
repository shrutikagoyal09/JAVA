public class String_subset_ascii_recursion {
    public static void main(String[] args) {
        subSets("abc","");
    }
    static void subSets(String str, String ans){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        subSets(str.substring(1),ans);
        subSets(str.substring(1),ans+ch);
        subSets(str.substring(1),ans + (ch+0));

    }
}
