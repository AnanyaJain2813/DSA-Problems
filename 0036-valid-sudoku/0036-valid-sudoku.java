class Solution {
    public boolean isValidSudoku(char[][] board) {

       
        for(int i = 0; i < 9; i++){
              Set<Character> st = new HashSet<>();
              for(int j = 0; j < 9; j++){
                
                if(board[i][j] == '.')continue;
                if(st.contains(board[i][j])) return false;
                st.add(board[i][j]);
              }
        }

        for(int col = 0; col < board[0].length; col++){
              Set<Character> st = new HashSet<>();
              for(int i = 0; i < 9; i++){
                char val = board[i][col];
                 if(board[i][col] == '.') continue;
                if(st.contains(val)) return false;
                st.add(val);
              }
        }
      for(int k = 0; k < 9; k++){
          Set<Character> st = new HashSet<>();
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){

                int row = (k/3) * 3 + i;
                int col = (k%3) * 3 + j;

                if(board[row][col] == '.')continue;
                if(st.contains(board[row][col])) return false;
                st.add(board[row][col]);
            }
        }
      }
        return true;
    }
}