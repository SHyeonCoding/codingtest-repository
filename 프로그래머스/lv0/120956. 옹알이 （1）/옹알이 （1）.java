class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for(String s : babbling) {
            s = s.replace("aya", "1").replace("ye", "1").replace("woo", "1").replace("ma", "1"); 
            if(!s.matches("(.*)[a-z](.*)")) answer++;
        }
        return answer;
    }
}