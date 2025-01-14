package Maze;

public class BasicMaze {
    public static void main(String[] args) {
       maze("",0,0);
    }

    static int maze(int i,int j){
        if(i==1 || j==1){
//            c++;
            System.out.println("Array Indexes are ("+i+","+j+")");
            return 1;
        }
        int f=maze(i-1,j);
        int s=maze(i,j-1);
        return f+s;
    }
    static void maze(String p,int i,int j){
        if(i==2 && j==2){
//            c++;
            System.out.println("Array Indexes are ("+i+","+j+") "+p);
            return;
        }
        if(i!=2){
        maze(p+"D",i+1,j);}
//        if(i>1&&j>1){
//            maze(p+"d",i-1,j-1);}
        if(j!=2){
        maze(p+"R",i,j+1);}

    }
}
