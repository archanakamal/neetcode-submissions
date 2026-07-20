class Solution {
    public void backtrack(int[] nums,int index,List<List<Integer>> res,List<Integer> arr){
        res.add(new ArrayList<>(arr));
        for(int i=index;i<nums.length;i++){
            if(i>index && nums[i]==nums[i-1]){
                continue;
            }
            arr.add(nums[i]);
            backtrack(nums,i+1,res,arr);
            arr.remove(arr.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums,0,res,new ArrayList<>());
        return res;
    }
}
