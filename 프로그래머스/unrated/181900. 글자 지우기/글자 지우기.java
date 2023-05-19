class Solution {
    public String solution(String my_string, int[] indices) {
        String[] str = my_string.split("");
        String answer = "";
        
        for(int i = 0; i < indices.length; i++) {
            str[indices[i]] = "";
        }
        
        for(String s : str) {
            answer += s;
        }
        
        return answer;
    }
}