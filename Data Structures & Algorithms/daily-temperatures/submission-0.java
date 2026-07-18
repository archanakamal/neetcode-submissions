class Solution {
    public int[] dailyTemperatures(int[] nums) {
        int[] res=new int[nums.length];
        Stack<Integer> stk=new Stack<>();
        for(int i=0;i<nums.length;i++){
                while(!stk.isEmpty() && nums[stk.peek()]<nums[i]){
                    res[stk.peek()]=(i-stk.pop());
                }
                stk.push(i);
        }
        return res;
    }
}
