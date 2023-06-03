class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for(int n = i; n <= j; n++) {
            String str = String.valueOf(n);
            
            answer += str.length() - str.replace(String.valueOf(k), "").length();
        }
        return answer;
    }
}