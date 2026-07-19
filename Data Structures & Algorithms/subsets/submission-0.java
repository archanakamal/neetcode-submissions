class Solution {
    public List<List<Integer>> func(int[] nums,int start,int end,List<List<Integer>> res){
        List<Integer> arr=new ArrayList<>();
        backtrack(nums,0,nums.length,res,arr);
        return res;
    }
    public void backtrack(int[] nums,int index,int n,List<List<Integer>> res,List<Integer> arr){
        res.add(new ArrayList<>(arr));

        for(int i=index;i<n;i++){
            arr.add(nums[i]);
            backtrack(nums,i+1,n,res,arr);
            arr.remove(arr.size()-1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        res=func(nums,0,nums.length,res);
        return res;
    }
}
