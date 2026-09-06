class Solution {
    public static List<List<Integer>> func(int[] nums,int target,int index,List<List<Integer>> res){
        //Arrays.sort(nums);
        backtrack(nums,target,index,res,0,new ArrayList<>());
        return res;
    }
    public static void backtrack(int nums[],int target,int index,List<List<Integer>> res,int sum,List<Integer> temp){
       if(sum==target){
           res.add(new ArrayList(temp));
           return;
       }
       if(sum>target){
           return;
       }
       for(int i=index;i<nums.length;i++){
           if(i>index && nums[i]==nums[i-1]){
               continue;
           }
           temp.add(nums[i]);
           backtrack(nums,target,i,res,sum+nums[i],temp);
           temp.remove(temp.size()-1);
       }
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res=new ArrayList<>();
        res=func(nums,target,0,res);
        return res;
    }
}
