class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch >= 97) {
                if(ch + n > 122) ch += n - 122 + 96;
                else ch += n;
            } else if(ch >= 65) {
                if(ch + n > 90) ch += n - 90 + 64;
                else ch += n;
            }
            
            answer += ch;
        }
        return answer;
    }
}