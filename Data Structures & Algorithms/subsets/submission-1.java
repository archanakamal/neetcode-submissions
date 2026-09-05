class Solution {
    public static List<List<Integer>> func(int nums[],List<List<Integer>> res,int index,int n){
        backtrack(index,nums,n,res,new ArrayList<>());
        return res;
    }
    public static void backtrack(int index,int[] nums,int n,List<List<Integer>> res,List<Integer> temp){
        res.add(new ArrayList<>(temp));
        for(int i=index;i<nums.length;i++){
            temp.add(nums[i]);
            backtrack(i+1,nums,n,res,temp);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        int n=nums.length;
        res=func(nums,res,0,n);
        return res;
    }
}
