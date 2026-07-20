class Solution {

    public List<List<Integer>> func(int nums[],int target,List<List<Integer>> res){
        List<Integer> arr=new ArrayList<>();
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
            if(i>index && nums[i]==nums[i-1]){
                continue;
            }
            if(sum+nums[i]>target){
                break;
            }
            arr.add(nums[i]);
            backtrack(nums,i+1,sum+nums[i],target,res,arr);
            arr.remove(arr.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(candidates);
        res=func(candidates,target,res);
        return res;
    }
}
