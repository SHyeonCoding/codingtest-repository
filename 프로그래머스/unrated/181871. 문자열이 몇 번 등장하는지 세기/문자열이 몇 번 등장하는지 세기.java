class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        int idx = 0;
        while(idx < myString.length()) {
            if(myString.indexOf(pat, idx) == -1) {
                break;
            } 
            
            answer++;
            idx = myString.indexOf(pat, idx) + 1;
        }
        
        return answer;
    }
}