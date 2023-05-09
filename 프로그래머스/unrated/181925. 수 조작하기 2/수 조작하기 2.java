class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        
        for(int i = 1; i < numLog.length; i++) {
            if(numLog[i - 1] < numLog[i]) {
                if(Math.abs(numLog[i] - numLog[i - 1]) == 1) answer += "w";
                else answer += "d";
            } else {
                if(Math.abs(numLog[i] - numLog[i - 1]) == 1) answer += "s";
                else answer += "a";
            }
        }
        
        return answer;
    }
}