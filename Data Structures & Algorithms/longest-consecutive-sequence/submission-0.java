class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int max=0;
        for(int i : nums){

            if(set.contains(i - 1))
                continue;      // not the start

            int cnt = 1;
            int curr = i;

            while(set.contains(curr + 1)){
                cnt++;
                curr++;
            }

            max = Math.max(max, cnt);
        }
        return max;
    }
}
