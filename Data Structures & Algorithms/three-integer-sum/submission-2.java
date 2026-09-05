
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {

            // Skip duplicate fixed numbers
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int target = 0 - nums[i];

            int low = i + 1;
            int high = nums.length - 1;

            while (low < high) {

                int sum = nums[low] + nums[high];

                if (sum == target) {

                    list.add(Arrays.asList(
                        nums[i],
                        nums[low],
                        nums[high]
                    ));

                    low++;
                    high--;

                    // Skip duplicates
                    while (low < high && nums[low] == nums[low - 1]) {
                        low++;
                    }

                    while (low < high && nums[high] == nums[high + 1]) {
                        high--;
                    }
                }

                else if (sum < target) {
                    low++;
                }

                else {
                    high--;
                }
            }
        }

        return list;
    }
}

