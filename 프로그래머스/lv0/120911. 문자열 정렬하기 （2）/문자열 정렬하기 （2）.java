import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        my_string = my_string.toLowerCase();
        String answer = "";
        
        String[] arr = my_string.split("");
        Arrays.sort(arr);
        
        for(String s : arr) {
            answer += s;
        }
        return answer;
    }
}