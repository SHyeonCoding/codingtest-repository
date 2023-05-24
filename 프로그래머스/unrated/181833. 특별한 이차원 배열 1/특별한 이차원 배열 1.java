class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        
        int idx = 0;
        for(int i = 0; i < n; i++) {
            answer[i][idx++] = 1;
        }
        
        return answer;
    }
}