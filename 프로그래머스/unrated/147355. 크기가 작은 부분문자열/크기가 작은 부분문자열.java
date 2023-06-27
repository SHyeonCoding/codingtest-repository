class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int i = 0;
        long num = Long.parseLong(p);
        
        while(i <= t.length() - p.length()) {
            if(num >= Long.parseLong(t.substring(i, i + p.length()))) answer++;
            i++;
        } 
        
        return answer;
    }
}