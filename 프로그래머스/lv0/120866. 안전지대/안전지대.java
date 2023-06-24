class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                if(board[i][j] == 1) {
                    for(int x = i - 1; x < i + 2; x++) {
                        if(x < 0 || x >= board.length) continue;
                        else {
                            for(int y = j - 1; y < j + 2; y++) {
                                if(y < 0 || y >= board.length) continue;
                                if(board[x][y] < 1) board[x][y] = 2;
                            }
                        }
                    }
                }
            }
        }
        
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                if(board[i][j] == 0) answer++;
            }
        }
        
        return answer;
    }
}