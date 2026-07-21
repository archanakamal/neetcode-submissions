class Solution {
    public boolean backtrack(char[][] board, String word,int i,int j,int index){
        if(i<0 || j<0 || i>=board.length || j>=board[0].length || board[i][j]!=word.charAt(index) ){
            return false;
        }
        if(index == word.length() - 1){
            return true;
        }
        char temp = board[i][j];
        board[i][j] = '#';

        // Explore all 4 directions
        boolean found =
                backtrack(board, word, i + 1, j, index + 1) ||
                backtrack(board, word, i - 1, j, index + 1) ||
                backtrack(board, word, i, j + 1, index + 1) ||
                backtrack(board, word, i, j - 1, index + 1);

        // Restore the original character (Backtracking)
        board[i][j] = temp;

        return found;


    }
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    if(backtrack(board,word,i,j,0)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
