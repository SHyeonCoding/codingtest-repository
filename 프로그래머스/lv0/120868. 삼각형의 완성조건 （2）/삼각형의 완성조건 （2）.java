class Solution {
    public int solution(int[] sides) {
        int max = Math.max(sides[0], sides[1]);
        int min = Math.min(sides[0], sides[1]);
        int cnt = 0;
        
        for(int i = 1; i <= max; i++) {
            if(min + i > max) cnt++;
        }
        
        return cnt + (max + min - max - 1);
    }
}