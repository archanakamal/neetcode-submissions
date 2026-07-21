class Solution {

    public void backtrack(int open,int close,List<String> res,StringBuilder arr,int n){
        if(arr.length()==2*n){
            res.add(arr.toString());
            return;
        }

       if(open < n){
            arr.append('(');
            backtrack(open+1,close,res,arr,n);
            arr.deleteCharAt(arr.length() - 1);
        }

        if( close < open){
            arr.append(')');
            backtrack(open,close+1,res,arr,n);
            arr.deleteCharAt(arr.length() - 1);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        backtrack(0,0,res,new StringBuilder(),n);
        return res;
    }
}
