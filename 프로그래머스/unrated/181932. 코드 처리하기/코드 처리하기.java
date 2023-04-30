class Solution {
    public String solution(String code) {
        String answer = "";
        boolean mode = true;
        
        for(int i = 0; i < code.length(); i++) {
            if(code.charAt(i) == '1') {
                mode = !mode;
                continue;
            }
            if(mode && i % 2 == 0) answer += code.charAt(i);
            else if(!mode && i % 2 == 1) answer += code.charAt(i); 
        }
        
        return answer.isEmpty() ? "EMPTY" : answer;
    }
}