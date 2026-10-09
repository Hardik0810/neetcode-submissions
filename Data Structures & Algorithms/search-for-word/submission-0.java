class Solution {
    private int rows;
    private int cols;
    public boolean exist(char[][] board, String word) {
        rows = board.length;
        cols = board[0].length;
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(helper(board, word, i, j, 0)){
                    return true;
                };
            }
        }
        return false;

        
    }
    public boolean helper(char[][] board, String word, int r, int c, int i){
        if(i >= word.length()){
            return true;
        }
        if(r < 0 || c < 0 || r >= rows || c >= cols || board[r][c] != word.charAt(i) || board[r][c] == '*'){
            return false;
        }
        board[r][c] = '*';
        boolean res = helper(board, word, r + 1, c,  i + 1) || 
                      helper(board, word, r - 1, c,  i + 1) ||
                      helper(board, word, r, c + 1, i + 1) ||
                      helper(board, word, r, c - 1,  i + 1);
        board[r][c] = word.charAt(i);
        return res;
    }
}
