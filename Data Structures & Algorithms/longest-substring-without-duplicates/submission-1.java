class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }
        HashSet<Character> set=new HashSet<>();
        int left=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                while(set.contains(ch) && left<s.length()){
                    set.remove(s.charAt(left));
                    left++;
                }
                set.add(s.charAt(i));
                max=Math.max(max,(i-left)+1);
        }
        return max;

    }
}
