public class Equal_string {
    public static void main(String[] args) {
        String[] word1 = {"a","bc"};
        String[] word2 = {"ab","c"};
        String s1 = "";
        String s2 = "";
        for(int i=0; i<word1.length; i++){
            s1 = s1 + word1[i];
        }
        for(int i=0; i<word2.length; i++){
            s2 = s2 + word2[i];
        }
        System.out.println(s1);
        System.out.println(s2);
        Boolean check = false;
        if(s1.equals(s2) == true){
            check = true;
        }
        else{
            check = false;
        }
        System.out.println(check);
    }
}
