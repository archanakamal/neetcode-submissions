class Solution {
    public boolean bs(int[] matrix,int start,int n,int target){
        int low=0,high=n;
        while(low<=high){
            int mid = low + (high - low) / 2;
            if(matrix[mid]==target){
                return true;
            }
            else if(matrix[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length,m= matrix[0].length;
        for(int i=0;i<n;i++){
            if(target>=matrix[i][0] && target<=matrix[i][m-1]){
                return bs(matrix[i],0,m-1,target);
            }
        }
        return false;
    }
}
