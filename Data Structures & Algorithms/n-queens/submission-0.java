class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] ch = new char[n][n];
        List<List<String>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Arrays.fill(ch[i], '.');
        }
        helper(list, ch, n, 0);
        return list;

        
    }
    public void helper(List<List<String>> list, char[][] ch, int n, int row){
        if(row >= n){
            list.add(new ArrayList<>(strBuilder(ch)));
            return;
        }
        for(int i = 0; i < n; i++){
            if(isSafe(ch, row, i, n)){
                ch[row][i] = 'Q';
                helper(list, ch, n, row + 1);
                ch[row][i] = '.';
            }
        }


    }
    public boolean isSafe(char[][] ch, int row, int col, int n){
        for(int i = 0; i < row; i++){
            if(ch[i][col] == 'Q' ){
                return false;
            }
        }
       
    for(int r = row - 1, c = col - 1; r >= 0 && c >= 0; r--, c--){
        if(ch[r][c] == 'Q' ){
            return false;
        }
    }

    
    for(int r = row - 1, c = col + 1; r >= 0 && c < n; r--, c++){
        if(ch[r][c] == 'Q' ){
            return false;
        }
    }
        return true;
    }
    public List<String> strBuilder(char[][] l){
        List<String> list = new ArrayList<>();
        for (char[] row : l) {
            list.add(new String(row)); 
        }
        return list;
    }

    
}
