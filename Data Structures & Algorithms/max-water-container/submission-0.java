class Solution {
    public int maxArea(int[] nums) {
        int left=0,right=nums.length-1;
        int max=Integer.MIN_VALUE;
        while(left<right){
            int amt=Math.min(nums[left],nums[right])*(right-left);
            if(nums[left]<nums[right]){
                left++;
            }
            else{
                right--;
            }

            max=Math.max(amt,max);
        }
        return max;
    }
}
