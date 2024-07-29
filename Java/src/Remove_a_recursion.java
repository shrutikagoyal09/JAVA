
public class Remove_a_recursion {
    public static void main(String[] args) {
        System.out.println(remove2("baccadahah"));
    }
    //method 1
    static void remove(String str , String ans ){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(0);
        if(ch =='a'){
            remove(str.substring(1), ans);
        }
        else{
            remove(str.substring(1), ans +ch);
        }
    }


    //method 2
    static String remove2(String str){
        if(str.isEmpty()){
            return "";
        }

        char ch = str.charAt(0);
        if(ch =='a'){
           return remove2(str.substring(1));
        }
        else{
           return ch + remove2(str.substring(1));
        }
    }
}
