import java.math.BigInteger;

class Solution {
    public int solution(int balls, int share) {
        BigInteger answer = fact(balls).divide(fact(balls - share).multiply(fact(share)));
        
        return answer.intValue();
    }
    
    public static BigInteger fact(int n) {
        BigInteger result = BigInteger.ONE;
        
        for(int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        
        return result;
    }
}