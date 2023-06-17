class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        int cnt = 1;
        
        for(int i = 0; i < score.length; i++) {
            for(int j = 0; j < score.length; j++) {
                if((double) (score[i][0] + score[i][1]) / 2 < (double)(score[j][0] + score[j][1]) / 2) {
                    cnt++;
                }
            }
            
            answer[i] = cnt;
            cnt = 1;
        }
        
        return answer;
    }
}