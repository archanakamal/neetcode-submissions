class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder res=new StringBuilder();
        for (int i = 0; i < s.length(); i++) { 
            char ch = s.charAt(i); 
            if (Character.isLetterOrDigit(ch)) { 
               res.append(Character.toLowerCase(ch)); 
               }
        }
        boolean val=true;
        int low=0;
        int high=res.length()-1;
        while(low<high){
            if(res.charAt(low)==res.charAt(high)){
                low++;
                high--;
            }
            else{
                val=false;
                break;
            }
        }
        return val;
    }
}
