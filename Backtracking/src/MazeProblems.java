import java.util.ArrayList;

public class MazeProblems {
    static void main(String[] args) {
//        System.out.println(count(3 , 3));
//        path("" , 3 , 3);
//        System.out.println(pathRet("" ,3 , 3));
//        System.out.println(pathRetDiag("" , 3 , 3));
        boolean[][] maze = {
                {true , true , false},
                {true , false , true},
                {true , true , true}
        };
        pathWithRestrictions("" , maze , 0 , 0);
    }
    // count number of ways
    static int count(int r , int c){
        if(r==1 || c == 1){
            return 1;
        }
        int left = count(r-1 , c);
        int right = count(r , c-1);
        return left + right;
    }
    // print path
    static void path(String p , int r , int c){
        if(r == 1 && c== 1){
            System.out.println(p);
            return;
        }
        if( r > 1){
            path(p+'D' , r-1 , c);
        }
        if(c > 1){
            path(p+'R' , r , c-1);
        }
    }
    // return in ArrayList
    static ArrayList<String> pathRet(String p , int r , int c){
        if(r == 1 && c== 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        if( r > 1){
            list.addAll(pathRet(p+'D', r-1 , c));
        }
        if(c > 1){
            list.addAll(pathRet(p+'R', r, c -1));
        }
        return list;
    }
    // go diagonally
    static ArrayList<String> pathRetDiag(String p , int r , int c){
        if(r == 1 && c== 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        if( r > 1){
            list.addAll(pathRetDiag(p+'V', r-1 , c));
        }
        if(c > 1){
            list.addAll(pathRetDiag(p+'H', r, c -1));
        }
        if(r > 1 && c>1){
            list.addAll(pathRetDiag(p+'D' , r-1 , c - 1));
        }
        return list;
    }
    // path with restrictions
    static void pathWithRestrictions(String p , boolean[][] maze , int r , int c){
        if(r == maze.length - 1  && c == maze[0].length - 1 ){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        if( r < maze.length - 1){
            pathWithRestrictions(p+'D' , maze , r+1 , c);
        }
        if(c < maze[0].length - 1){
            pathWithRestrictions(p+'R' ,maze ,  r , c+1);
        }
    }
}
