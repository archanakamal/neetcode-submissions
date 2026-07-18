class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[k];

        // Frequency Map
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Bucket Array
        List<Integer>[] bucket = new ArrayList[nums.length + 1];

        // Fill Buckets
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            int frequency = entry.getValue();
            int number = entry.getKey();

            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }

            bucket[frequency].add(number);
        }

        // Traverse Buckets
        int index = 0;

        for (int i = bucket.length - 1; i >= 0 && index < k; i--) {

            if (bucket[i] != null) {

                for (int num : bucket[i]) {

                    res[index++] = num;

                    if (index == k)
                        break;
                }
            }
        }

        return res;
    }
}