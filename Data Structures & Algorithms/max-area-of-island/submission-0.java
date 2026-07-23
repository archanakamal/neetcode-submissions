class Solution {
    public int dfs(int[][] grid,int i,int j,int n,int m){
        if(i<0 || j<0 || i>=n ||  j>=m || grid[i][j]!=1){
            return 0;
        }
        grid[i][j]=2;
        return 1+dfs(grid,i+1,j,n,m)+dfs(grid,i-1,j,n,m)+dfs(grid,i,j+1,n,m)+dfs(grid,i,j-1,n,m);
    }
    public int maxAreaOfIsland(int[][] grid) {
        int max=0;
        int n=grid.length,m=grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    int cnt=dfs(grid,i,j,n,m);
                    max=Math.max(cnt,max);
                }
            }
        }
        return max;
    }
}
