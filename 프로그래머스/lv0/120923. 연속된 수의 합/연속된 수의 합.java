class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        int n = total / num;
        int m = total % num == 0 ? num / 2 : num / 2 - 1;
        
        for(int i = 0; i < num; i++) {
            answer[i] = n - m + i;
        }
        
        return answer;
    }
}