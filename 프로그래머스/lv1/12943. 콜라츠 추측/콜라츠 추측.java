class Solution {
    public int solution(int num) {
        if(num == 1) return 0;
        
        long x = num;
        int cnt = 0;
        
        while(cnt < 500) {
            cnt++;
            if(x % 2 == 0) x /= 2;
            else x = x * 3 + 1;
            
            if(x == 1) break;
        }
        
        return cnt == 500 ? -1 : cnt;
    }
}