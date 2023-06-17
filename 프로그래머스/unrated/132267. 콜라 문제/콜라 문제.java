class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int x = 0;
        
        while(n >= a) {
            x = n / a * b;
            answer += x;
            n = n - a * (n / a) + x;
        }
        
        return answer;
    }
}