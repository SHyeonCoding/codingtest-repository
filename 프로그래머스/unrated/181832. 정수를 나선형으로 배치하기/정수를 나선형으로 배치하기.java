class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int cnt = 1;
        int x = 0;
        int y = 0;
        int num = 0;
        
        while(cnt <= n * n) {
            answer[x][y] = cnt++;
            
            if(num == 0) {
                if(y == n - 1 || answer[x][y + 1] != 0) {
                    num = 1;
                    x++;
                } else y++;
            } else if(num == 1) {
                if(x == n - 1 || answer[x + 1][y] != 0) {
                    num = 2;
                    y--;
                } else x++;
            } else if(num == 2) {
                if(y == 0 || answer[x][y - 1] != 0) {
                    num = 3;
                    x--;
                } else y--;
            } else if(num == 3) {
                if(x == 0 || answer[x - 1][y] != 0) {
                    num = 0;
                    y++;
                } else x--;
            }
        }
        
        return answer;
    }
}