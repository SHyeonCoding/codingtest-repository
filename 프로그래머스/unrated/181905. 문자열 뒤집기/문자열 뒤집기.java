class Solution {
    public String solution(String my_string, int s, int e) {
        String[] arr = my_string.split("");
        
        for(int i = 0; i <= (e - s) / 2; i++) {
            String temp = arr[s + i];
            arr[s + i] = arr[e - i];
            arr[e - i] = temp;
        }
        
        String answer = "";
        for(String str : arr) {
            answer += str;
        }
        
        return answer;
    }
}