class Solution {
    public void func(char[][] grid,int n,int m,int i,int j){
        if(i<0 || j<0 || i>=n || j>=m || grid[i][j]!='1'){
            return;
        }
        grid[i][j]='#';
        func(grid,n,m,i+1,j);
        func(grid,n,m,i,j+1);
        func(grid,n,m,i-1,j);
        func(grid,n,m,i,j-1);
    }
    public int numIslands(char[][] grid) {
        int n=grid.length,m=grid[0].length;
        int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'){
                    cnt+=1;
                    func(grid,n,m,i,j);
                }
            }
        }
        return cnt;

    }
}
