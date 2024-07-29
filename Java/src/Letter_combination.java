import java.util.ArrayList;
import java.util.List;

public class Letter_combination {
    public static void main(String[] args) {
         String digits = "23";
        System.out.println(letterCombinations(digits));
    }
    static List<String> letterCombinations(String digits){

        String ans ="";
        if(digits.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        int digit = digits.charAt(0) -'0';
        ArrayList<String> list = new ArrayList<>();
        for(int i= (digit-2)*3; i<(digit-1)*3; i++){
          char ch = (char)('a' +i);


          list.addAll(letterCombinations(digits.substring(1)));
            ans = ans+ch;
            list.add(ans);

        }
        return list;
    }
}
