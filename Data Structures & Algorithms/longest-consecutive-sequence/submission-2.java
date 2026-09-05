class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        HashSet<Integer> set=new HashSet<>();
        int max=0;
        for(int i:nums){
            set.add(i);
        }
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i]+1)){
                continue;
            }
            int cnt=0;
            int x=nums[i];
            while(set.contains(x)){
                set.remove(x);
                cnt++;
                x=x-1;
            }
            max=Math.max(max,cnt);
        }
        return max;
    }
}
