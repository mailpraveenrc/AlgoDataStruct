package DynamicRecursion;

public class CountIsland {
    public int numIslands(char[][] grid) {
            int count =0;
            for(int k=0;k<grid.length;k++) {
                for (int m = 0; m < grid[k].length; m++) {
                if(grid[k][m] == '1'){
                    count++;
                    bfs(grid,k,m);
                }
            }
        }
        return count;
    }
    public void bfs (char[][] input,int k,int m){
        if(k < 0 || m < 0 || k >= input.length || m >= input[k].length)return;
        if(input[k][m] == '0') return;
        input[k][m] = '0';
        bfs(input,k+1,m);
        bfs(input,k,m+1);
        bfs(input,k-1,m);
        bfs(input,k,m-1);
    }

    public static void main(String[] args) {
        char[][] input = new char[4][4];
        input[0][0] = '1';
        input[0][1] = '1';
        input[0][2] = '1';
        input[0][3] = '1';

        input[1][0] = '0';
        input[1][1] = '0';
        input[1][2] = '0';
        input[1][3] = '0';

        input[2][0] = '0';
        input[2][1] = '0';
        input[2][2] = '0';
        input[2][3] = '0';

        input[3][0] = '1';
        input[3][1] = '1';
        input[3][2] = '1';
        input[3][3] = '1';

        for(char k=0;k<input.length;k++){
            for(char m=0;m<input[k].length;m++){
                System.out.print(" " + input[k][m]);
            }
            System.out.println();
        }
        CountIsland o = new CountIsland();
        System.out.println("---------"+o.numIslands(input));

    }
}
