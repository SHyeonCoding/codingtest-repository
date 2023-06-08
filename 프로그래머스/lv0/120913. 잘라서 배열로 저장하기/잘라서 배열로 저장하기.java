class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = new String[(my_str.length() + (n - 1)) / n];
        
        for(int i = 0; i < answer.length; i++) {
            if(i == answer.length - 1) answer[i] = my_str.substring(n * i);
            else answer[i] = my_str.substring(n * i, n * (i + 1));
        }
        
        return answer;
    }
}