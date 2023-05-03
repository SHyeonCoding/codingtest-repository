class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 1; i <= Math.sqrt(n); i++) {
            if(n % i == 0 && n / i != i) answer += 2;
            else if(n % i == 0) answer++;
        }
        
        return answer;
    }
}