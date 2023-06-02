import java.util.Arrays;

class Solution {
    public long solution(long n) {
        String[] arr = String.valueOf(n).split("");
        String answer = "";
        
        Arrays.sort(arr);
        
        for(String s : arr) {
            answer = s + answer;
        }
        
        return Long.parseLong(answer);
    }
}