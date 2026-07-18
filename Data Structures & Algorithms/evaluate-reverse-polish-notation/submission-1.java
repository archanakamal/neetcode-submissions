class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stk=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")){
                int x=Integer.parseInt(stk.pop());
                int y=Integer.parseInt(stk.pop());
                if(tokens[i].equals("+")){
                    stk.push(""+(x+y));
                }
                else if(tokens[i].equals("-")){
                    stk.push(""+(y-x));
                }
                else if(tokens[i].equals("*")){
                    stk.push(""+(x*y));
                }
                else{
                    stk.push(""+(y/x));
                }
            }
            else{
                stk.push(tokens[i]);
            }
        }
        return Integer.parseInt(stk.pop());
    }
}
