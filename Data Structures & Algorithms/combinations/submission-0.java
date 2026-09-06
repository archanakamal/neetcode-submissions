class Solution {
        public static List<List<Integer>> func(int[] nums, int k, int index,
                                           List<List<Integer>> res) {
        backtrack(nums, k, index, res, new ArrayList<>());
        return res;
    }

    public static void backtrack(int[] nums, int k, int index,
                                 List<List<Integer>> res,
                                 List<Integer> temp) {

        if (temp.size() == k) {
            res.add(new ArrayList<>(temp));
            return;
        }

        for (int i = index; i < nums.length; i++) {

            temp.add(nums[i]);

            backtrack(nums, k, i + 1, res, temp);

            temp.remove(temp.size() - 1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = i + 1;
        }

        List<List<Integer>> res = new ArrayList<>();

        res = func(nums, k, 0, res);
        return res;
    }
}