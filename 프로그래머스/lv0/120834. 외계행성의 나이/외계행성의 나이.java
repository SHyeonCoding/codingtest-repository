class Solution {
    public String solution(int age) {
        String answer = "";
        
        while(age > 0) {
            int n = age % 10;
            answer = (char) ('a' + n) + answer;
            age /= 10;
        }
        
        return answer;
    }
}