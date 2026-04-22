class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Row traversal
        for(int i=0;i<9;i++){
            HashSet<Character> hash= new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    continue;
                }
                if(hash.contains(board[i][j])){
                    return false;
                }
                hash.add(board[i][j]);
            }
        }
        //Column traversal
        for(int i=0;i<9;i++){
            HashSet<Character> hash= new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[j][i]=='.'){
                    continue;
                }
                if(hash.contains(board[j][i])){
                    return false;
                }
                hash.add(board[j][i]);
            }
        }
        // Square traversal
        for(int square=0;square<9;square++){
            Set<Character> seen= new HashSet<>();
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    int row= (square/3)*3 +i;
                int col= (square % 3)*3 + j;
                if(board[row][col]=='.') continue;
                if(seen.contains(board[row][col])) return false;
                seen.add(board[row][col]);
                }
            }
        }

        return true;


    }
}
