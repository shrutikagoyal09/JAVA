import java.util.ArrayList;
import java.util.Collection;

public class Final_rev_recursion {
    public static void main(String[] args) {
//        permutations("","abc");
//        System.out.println( permutations2("","abc"));
//        System.out.println( permutations3("","abc"));
//        maze("",3,3);
//        System.out.println(maze2("",3,3));
//        System.out.println(maze3(3,3));
//        maze4("",3,3);


        boolean[][] board = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
//        maze5(board,"",0,0);
        maze6(board,"",0,0);
    }
    static void permutations(String ans, String str){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(0);
        for(int i=0; i<ans.length()+1; i++){
            String f = ans.substring(0,i);
            String s = ans.substring(i,ans.length());
            permutations(f+ch+s,str.substring(1));
        }
    }



    static ArrayList<String> permutations2(String ans, String str){
        if(str.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        char ch = str.charAt(0);
        ArrayList<String> answer = new ArrayList<>();
        for(int i=0; i<ans.length()+1; i++){
            String f = ans.substring(0,i);
            String s = ans.substring(i,ans.length());
            answer.addAll(permutations2(f+ch+s,str.substring(1)));
        }
        return answer;
    }



    static int permutations3(String ans,String str){
        if(str.isEmpty()){
            return 1;
        }
        int count =0;
        char ch = str.charAt(0);

        for(int i=0; i<ans.length()+1; i++){
            String f = ans.substring(0,i);
            String s = ans.substring(i,ans.length());
            count += permutations3(f+ch+s,str.substring(1));
        }
        return count;
    }



    static void maze(String str, int rows, int col){
        if(rows==1 && col == 1){
            System.out.println(str);
            return;
        }
        if(rows>1){
            maze(str+"R",rows-1,col);
        }
        if(col>1){
            maze(str+"D",rows,col-1);
        }

    }


    static ArrayList<String> maze2(String str,int rows,int col){
        if(rows==1 && col == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(str);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if(rows>1){
            ans.addAll(maze2(str+"R",rows-1,col));
        }
        if(col>1){
            ans.addAll(maze2(str+"D",rows,col-1));
        }
        return ans;
    }



    static int maze3(int rows,int col){
        if(rows==1 || col==1){
            return 1;
        }

        int count =0;
        if(rows>1){
           count+= maze3(rows-1,col);
        }
        if(col>1){
           count+= maze3(rows,col-1);
        }
        return count;
    }


    static void maze4(String str, int rows, int col){
        if(rows==1 && col == 1){
            System.out.println(str);
            return;
        }
        if(rows>1){
            maze4(str+"R",rows-1,col);
        }
        if(col>1){
            maze4(str+"D",rows,col-1);
        }
        if(rows>1 && col>1){
            maze4(str+ "s",rows-1,col-1);
        }

    }


    static void maze5(boolean[][] board,String str, int rows,int col){
        if(rows==board.length-1 && col==board[0].length-1){
            System.out.println(str);
            return;
        }
        if(!board[rows][col]){
            return;
        }
        if(rows< board.length-1){
            maze5(board,str+"R",rows+1,col);
        }
        if(col<board[0].length-1){
            maze5(board,str+"D",rows,col+1);
        }

    }



    static void maze6(boolean[][] board,String str, int rows,int col){
        if(rows==board.length-1 && col==board[0].length-1){
            System.out.println(str);
            return;
        }

        if(!board[rows][col]){
            return;
        }
        board[rows][col]= false;
        if(rows< board.length-1){
            maze6(board,str+"R",rows+1,col);
        }
        if(col<board[0].length-1){
            maze6(board,str+"D",rows,col+1);
        }
        if(rows>0){
            maze6(board,str+"U",rows-1,col);
        }
        if(col>0){
            maze6(board,str+"l",rows,col-1);
        }
        board[rows][col] = true;
    }
}
