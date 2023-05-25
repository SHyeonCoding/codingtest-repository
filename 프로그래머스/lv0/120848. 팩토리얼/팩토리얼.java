class Solution {
    public int solution(int n) {
        int x = 1;
        int answer = 1;
        
        while(true) {
            x *= answer;
            if(x == n) break;
            if(x > n) {
                answer--;
                break;
            }
            answer++;
        }
        
        return answer;
    }
}