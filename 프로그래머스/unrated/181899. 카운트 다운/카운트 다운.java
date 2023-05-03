class Solution {
    public int[] solution(int start, int end) {
        int[] answer = new int[start - end + 1];
        int n = 0;
        
        for(int i = start; i >= end; i--) {
            answer[n] = i;
            n++;
        }
        
        return answer;
    }
}