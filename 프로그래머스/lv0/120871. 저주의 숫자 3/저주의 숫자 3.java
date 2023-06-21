class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean check = false;
        
        for(int i = 0; i < n; i++) {
            answer++;
            if(answer % 3 == 0 || String.valueOf(answer).contains("3")) check = true;
            
            while(check) {
                answer++;
                if(answer % 3 != 0 && !String.valueOf(answer).contains("3")) {
                    check = false;
                }
            }
        }
        
        return answer;
    }
}