class Solution {

    public void backtrack(int[] nums, boolean[] visited,
                          List<List<Integer>> res,
                          List<Integer> arr) {

        if (arr.size() == nums.length) {
            res.add(new ArrayList<>(arr));
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            if (visited[i])
                continue;

            visited[i] = true;
            arr.add(nums[i]);

            backtrack(nums, visited, res, arr);

            arr.remove(arr.size() - 1);
            visited[i] = false;
        }
    }

    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();

        backtrack(nums, new boolean[nums.length], res, new ArrayList<>());

        return res;
    }
}