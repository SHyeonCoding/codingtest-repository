class Solution {
    public int solution(int[][] sizes) {
        int max = 0;
        int min = 0;
        
        for(int i = 0; i < sizes.length; i++) {
            int m = Math.max(sizes[i][0], sizes[i][1]);
            int n = Math.min(sizes[i][0], sizes[i][1]);
            
            if(m > max) max = m;
            if(n > min) min = n;
        }
        
        return max * min;
    }
}