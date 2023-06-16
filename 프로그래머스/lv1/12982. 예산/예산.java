import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int n = 0;
        Arrays.sort(d);
        
        for(int i = 0; i < d.length; i++) {
            if(n + d[i] <= budget) {
                n += d[i];
                answer++;
            }
        }
        
        return answer;
    }
}