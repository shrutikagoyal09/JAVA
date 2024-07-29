import java.util.ArrayList;

public class Maze_problems {
    public static void main(String[] args) {
//        maze("",3,3);
        System.out.println(maze2("",3,3));
    }
    static void maze(String str, int r, int c){
        if(r==1 && c==1){
            System.out.println(str);
            return;
        }

        if(r>1){
            maze(str + "d", r-1,c);
        }
        if(c>1){
            maze(str+"r",r,c-1);
        }

    }

    static ArrayList<String> maze2(String str, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(str);
            return list;
        }
         ArrayList<String> ans = new ArrayList<>();
        if(r>1){
          ans.addAll(maze2(str + "d", r-1,c));
        }
        if(c>1){
           ans.addAll(maze2(str+"r",r,c-1));
        }
        return ans;
    }

}
