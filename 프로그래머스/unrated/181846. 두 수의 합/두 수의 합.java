import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        
        return String.valueOf(new BigInteger(a).add(new BigInteger(b)));
    }
}