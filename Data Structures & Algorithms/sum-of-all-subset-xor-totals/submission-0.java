class Solution {
    public static int func(int[] nums,int index,int n){
        return backtrack(nums,index,n,0);
    }
    
    public static int backtrack(int nums[],int index,int n,int xor){
        if(index==nums.length){
            return xor;
        }
        int take=backtrack(nums,index+1,n,xor^nums[index]);
        
        int not_take=backtrack(nums,index+1,n,xor);
        return take+not_take;
    }
    public int subsetXORSum(int[] nums) {
        int res=func(nums,0,nums.length-1);
        return res;
    }
}