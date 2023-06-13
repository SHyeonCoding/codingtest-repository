class Solution {
    public int[] solution(int n, int m) {
        int gcd = 0;
        
        for(int i = 1; i <= Math.min(n, m); i++) {
            if(n % i == 0 && m % i == 0) {
                gcd = i;
            }
        }
        
        return new int[]{gcd, n * m / gcd};
    }
}