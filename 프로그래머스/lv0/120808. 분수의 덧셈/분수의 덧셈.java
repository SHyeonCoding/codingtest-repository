class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        answer[0] = numer1 * denom2 + denom1 * numer2;
        answer[1] = denom1 * denom2;
        int gcd = 1;
        
        for(int i = 1; i <= Math.min(answer[0], answer[1]); i++) {
            if(answer[0] % i == 0 && answer[1] % i == 0) gcd = i;
        }

        answer[0] /= gcd;
        answer[1] /= gcd;
        return answer;
    }
}