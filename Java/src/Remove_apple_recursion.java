public class Remove_apple_recursion {
    public static void main(String[] args) {
        removeApple2("baccapphhd","");
    }
    static void removeApple(String str, String ans){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        if(str.startsWith("apple")){
            removeApple(str.substring(5),ans);

        }
        else{
           removeApple(str.substring(1),ans+ch);
        }
    }


    //method2
    static void removeApple2(String str, String ans){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        if(str.startsWith("app") && !str.startsWith("apple")){
            removeApple2(str.substring(3),ans);

        }
        else{
            removeApple2(str.substring(1),ans+ch);
        }
    }
}
