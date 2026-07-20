class Solution {

    public List<List<Integer>> func(int[] nums,int target,List<List<Integer>> res){
        List<Integer> arr=new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums,0,0,target,res,arr);
        return res;
    }

    public void backtrack(int[] nums,int index,int sum,int target,List<List<Integer>> res,List<Integer> arr){
        if(sum==target){
            res.add(new ArrayList<>(arr));
            return;
        }
        if(sum>target){
            return;
        }

        for(int i=index;i<nums.length;i++){
            if(sum + nums[i] > target)
                break;
            arr.add(nums[i]);
            
            backtrack(nums,i,sum+nums[i],target,res,arr);
            arr.remove(arr.size()-1);
        }
    }

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res=new ArrayList<>();
        res=func(nums,target,res);
        return res;
    }
}
