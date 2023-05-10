class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            if(Character.isLowerCase(ch)) answer += Character.toUpperCase(ch);
            else answer += Character.toLowerCase(ch);
        }
        
        return answer;
    }
}