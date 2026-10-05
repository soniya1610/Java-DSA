package BasicQue;

public class FinadAllPathInMaze {
    static void main(String[] args) {
        boolean[][] maze = {
                {true , true , true},
                {true , true , true},
                {true , true , true},
        };
        pathAll("" , maze , 0 , 0);
    }
    static void pathAll(String p , boolean[][] maze , int r , int c){
        if(r == maze.length - 1  && c== maze[0].length - 1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        // I'm considering this block in my path
        maze[r][c] = false;
        if( r < maze.length - 1){
            pathAll(p+'D' , maze , r+1 , c);
        }
        if(c < maze[0].length - 1){
            pathAll(p+'R' ,maze ,  r , c+1);
        }
        if( r > 0){
            pathAll(p+'U' ,maze ,  r-1 , c);
        }
        if(c > 0){
            pathAll(p+'L' ,maze ,  r , c-1);
        }
        // this line is where the function will be over
        //so before the function gets removed , also remove the changes that were made bby that function call
        maze[r][c] = true;
    }
}

