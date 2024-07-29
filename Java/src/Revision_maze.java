import java.util.ArrayList;

public class Revision_maze {
    public static void main(String[] args) {
//        System.out.println(maze(3,3));
//        maze2("",3,3);
//        System.out.println(maze3("",3,3));
//        maze4("",3,3);
        boolean[][] maze = {
                {true,true,true},
                {true,true,true},
                {true,true,true},
        };
//        mazeRiver("",maze,0,0);
        allPaths("",maze,0,0);
    }

    static int maze(int r,int c){
        if(r==1 || c==1){
            return 1;
        }

        int left = maze(r-1,c);
        int right = maze(r,c-1);
        return left+right;
    }


    static void maze2(String s, int r, int c){
        if(r==1 && c==1){
            System.out.println(s);
            return;
        }
        if(r>1){
            maze2(s+'D',r-1,c);
        }
        if(c>1){
            maze2(s+'R',r,c-1);
        }
    }




    static ArrayList<String> maze3(String s,int r,int c){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(s);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if(r>1){
            ans.addAll(maze3(s+'D',r-1,c));
        }
        if(c>1){
            ans.addAll(maze3(s+'R',r,c-1));
        }
        return ans;
    }


    static void maze4(String s, int r, int c){
        if(r==1 && c==1){
            System.out.println(s);
            return;
        }
        if(r>1){
            maze4(s+'D',r-1,c);
        }
        if(c>1){
            maze4(s+'R',r,c-1);
        }
        if(r>1 && c>1){
            maze4(s+'S',r-1,c-1);
        }
    }


    static void mazeRiver(String s, boolean[][] maze,int r,int c){
        if(r==maze.length-1 && c==maze.length-1){
            System.out.println(s);
            return;
        }
        if(maze[r][c] == false){
            return;
        }
        if(r<maze.length-1){
            mazeRiver(s+'D',maze,r+1,c);
        }
        if(c<maze[0].length-1){
            mazeRiver(s+'R',maze,r,c+1);
        }

    }



    static void allPaths(String s, boolean[][] maze,int r,int c){
        if(r==maze.length-1 && c==maze.length-1){
            System.out.println(s);
            return;
        }

        if(maze[r][c] ==false){
            return;
        }
        maze[r][c] = false;
        if(r<maze.length-1){
            allPaths(s+'D',maze,r+1,c);
        }
        if(c<maze[0].length-1){
            allPaths(s+'R',maze,r,c+1);
        }
        if(r>0){
            allPaths(s+'U',maze,r-1,c);
        }
        if(c>0){
            allPaths(s+'L',maze,r,c-1);
        }
        maze[r][c] = true;
    }

}
