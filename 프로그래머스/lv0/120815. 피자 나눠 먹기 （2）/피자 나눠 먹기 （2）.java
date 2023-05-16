class Solution {
    public int solution(int n) {
        int idx = 1;
        
        while(n * idx % 6 != 0) {
            idx++;
        }
        
        return n * idx / 6;
    }
}