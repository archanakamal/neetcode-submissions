class Solution {

    public static List<List<String>> func(String s, List<List<String>> res,
                                          int index, int n) {
        backtrack(s, res, index, n, new ArrayList<>());
        return res;
    }

    public static void backtrack(String s, List<List<String>> res,
                                  int index, int n,
                                  List<String> temp) {

        // Complete partition
        if (index == n) {
            res.add(new ArrayList<>(temp));
            return;
        }

        // Try every possible substring starting at index
        for (int i = index; i < n; i++) {

            if (isPalindrome(s, index, i)) {

                // Choose
                temp.add(s.substring(index, i + 1));

                // Explore
                backtrack(s, res, i + 1, n, temp);

                // Undo
                temp.remove(temp.size() - 1);
            }
        }
    }

    public static boolean isPalindrome(String s, int left, int right) {

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public List<List<String>> partition(String s) {

        List<List<String>> res = new ArrayList<>();

        res = func(s, res, 0, s.length());

        return res;
    }
}